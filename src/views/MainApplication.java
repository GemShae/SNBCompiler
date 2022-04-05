package views;

import addons.Mp3;
import addons.reservewords.ReservedWordStyledDocument;
import domain.Functions;
import javazoom.jl.decoder.JavaLayerException;
import org.antlr.v4.gui.TreeViewer;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class MainApplication extends JFrame{
    //Declaration of variables

    //Variables for menu bar
    private JMenuBar snbMenuBar;
    private JMenu fileJMenu;
    private JMenu editMenu;
    private JMenu searchMenu;
    private JMenu viewMenu;
    private JMenu navigateMenu;
    private JMenu runMenu;
    private JMenu helpMenu;
    private JMenuItem saveMenuItem;
    private JMenuItem newMenuItem;
    private JMenuItem printMenuItem;
    private JMenuItem undoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    private JMenuItem deleteMenuItem;
    private JMenuItem findMenuItem;
    private JMenuItem replaceMenuItem;
    private JMenuItem runMenuItem;
    private JMenuItem debugMenuItem;
    private JSeparator fileMenuSeparator;
    private JSeparator fileMenuSeparator2;
    private JSeparator editMenuSeparator;
    private JSeparator editMenuSeparator2;

    //Panel for action Buttons
    private JPanel actionButtonPanel;
    private JLabel projectNameLabel;
    private JLabel sourceLabel;
    private JLabel fileNameLabel;
    private JLabel projectNameSeparator;
    private JLabel sourceSeparator;
    private JSeparator buttonsSeparator;
    private JButton runButton;
    private JButton debugButton;
    private JButton talkButton;

    //Separator for body
    private JSeparator bodySeparator;

    //Left side of body - Navigation
    private JPanel projectInformationPanel;
    private JLabel projectTitleLabel;
    private JLabel downArrow;
    private JLabel downArrow2;
    private JLabel projectNameLabel2;
    private JLabel outputFolderLabel;
    private JLabel rightArrow;
    private JLabel downArrow3;
    private JLabel sourceFolderLabel;
    private JLabel classFileLabel;
    private JLabel logoImageLabelButton;
    private JLabel logoImageLabelTop;
    private JLabel runDebugGifLabel;

    private Document document;
    private JTextPane writeCodeTextPane;
    private JTextPane lineNumbersTextPane;
    private JScrollPane writeCodeScrollPane;

    //Bottom of body - The tabs
    private JPanel entireConsoleDisplayPanel;
    private JPanel runResultsPanelTab;
    private JPanel debugResultsTab;
    public static JPanel astViewTab;
    public static JTextArea displayRunResultsTextArea;
    public static JTextArea debugResultsTextArea;
    private JScrollPane displayRunResultsScrollPane;
    private JScrollPane debugResultsScrollPane;
    public static TreeViewer treeViewer;
    private JTabbedPane consoleTabPane;


    public static Mp3 soundEffects = new Mp3();
    public static boolean debugCalled = false;
    public static ImageIcon gem = new ImageIcon("gif/gem_gif.gif");

    public MainApplication(String title) {
        initialiseComponents();
        this.setTitle(title);
        addToFrame();
        registerListeners();
        //registerKeyListeners();

        JOptionPane.showMessageDialog(this,"Welcome to SNB Compiler","Welcome!",
                JOptionPane.INFORMATION_MESSAGE,gem);

        getProjectAndFileNames();

        try {
            soundEffects.playMp3("welcome");
        }catch (JavaLayerException javaLayerException) {
            javaLayerException.printStackTrace();
        }
    }

    private void initialiseComponents() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(new Dimension(1000,750));
        this.setFocusable(true);
        this.setLocationRelativeTo(null);

        //Menu Bar Stuff
        snbMenuBar = new JMenuBar();

        fileJMenu = new JMenu();
        fileJMenu.setText("File");
        fileJMenu.setIcon(new ImageIcon("images/file.png"));

        editMenu = new JMenu();
        editMenu.setText("Edit");
        editMenu.setIcon(new ImageIcon("images/edit.png"));

        searchMenu = new JMenu();
        searchMenu.setText("Search");
        searchMenu.setIcon(new ImageIcon("images/search.png"));

        viewMenu = new JMenu();
        viewMenu.setText("View");
        viewMenu.setIcon(new ImageIcon("images/view.png"));

        navigateMenu = new JMenu();
        navigateMenu.setText("Navigate");
        navigateMenu.setIcon(new ImageIcon("images/navigation.png"));

        runMenu = new JMenu();
        runMenu.setText("Run");
        runMenu.setIcon(new ImageIcon("images/run_menu.png"));

        helpMenu = new JMenu();
        helpMenu.setText("Help");
        helpMenu.setIcon(new ImageIcon("images/help.png"));

        saveMenuItem = new JMenuItem();
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        saveMenuItem.setIcon(new ImageIcon("images/save.png"));
        saveMenuItem.setText("Save");

        newMenuItem = new JMenuItem();
        newMenuItem.setIcon(new ImageIcon("images/new.png"));
        newMenuItem.setText("New");

        printMenuItem = new JMenuItem();
        printMenuItem.setIcon(new ImageIcon("images/printer.png"));
        printMenuItem.setText("Print..");

        undoMenuItem = new JMenuItem();
        undoMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        undoMenuItem.setIcon(new ImageIcon("images/undo.png"));
        undoMenuItem.setText("Undo");

        cutMenuItem = new JMenuItem();
        cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        cutMenuItem.setIcon(new ImageIcon("images/cut.png"));
        cutMenuItem.setText("Cut");

        copyMenuItem = new JMenuItem();
        copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        copyMenuItem.setIcon(new ImageIcon("images/copy.png"));
        copyMenuItem.setText("Copy");

        pasteMenuItem = new JMenuItem();
        pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        pasteMenuItem.setIcon(new ImageIcon("images/paste.png"));
        pasteMenuItem.setText("Paste");

        deleteMenuItem = new JMenuItem();
        deleteMenuItem.setIcon(new ImageIcon("images/delete.png"));
        deleteMenuItem.setText("Delete");

        findMenuItem = new JMenuItem();
        findMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        findMenuItem.setIcon(new ImageIcon("images/find.png"));
        findMenuItem.setText("Find");

        replaceMenuItem = new JMenuItem();
        replaceMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R,Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        replaceMenuItem.setIcon(new ImageIcon("images/replace.png"));
        replaceMenuItem.setText("Replace");

        runMenuItem = new JMenuItem();
        runMenuItem.setIcon(new ImageIcon("images/play.png"));
        runMenuItem.setText("Run");

        debugMenuItem = new JMenuItem();
        debugMenuItem.setIcon(new ImageIcon("images/debug.png"));
        debugMenuItem.setText("Debug");

        fileMenuSeparator = new JPopupMenu.Separator();
        fileMenuSeparator2 = new JPopupMenu.Separator();
        editMenuSeparator = new JPopupMenu.Separator();
        editMenuSeparator2 = new JPopupMenu.Separator();

        //Action button panel stuff

        actionButtonPanel = new JPanel();
        actionButtonPanel.setBounds(0,0,1000,30);
        actionButtonPanel.setBackground(new Color(37,123,112,255));
        actionButtonPanel.setLayout(null);
        actionButtonPanel.setVisible(true);

        projectNameLabel = new JLabel();
        projectNameLabel.setBounds(0,5,150,20);
        projectNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        projectNameLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
        projectNameLabel.setForeground(Color.WHITE);
        projectNameLabel.setText("UntiledProject");

        sourceLabel = new JLabel();
        sourceLabel.setBounds(138,5,100,20);
        sourceLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
        sourceLabel.setForeground(Color.WHITE);
        sourceLabel.setText("src");

        fileNameLabel = new JLabel();
        fileNameLabel.setBounds(190,5,150,20);
        fileNameLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
        fileNameLabel.setForeground(Color.WHITE);
        fileNameLabel.setText("UntiledFile.snb");

        projectNameSeparator = new JLabel();
        projectNameSeparator.setBounds(120,6,50,20);
        projectNameSeparator.setForeground(Color.WHITE);
        projectNameSeparator.setFont(new Font("Times New Roman",Font.BOLD,18));
        projectNameSeparator.setText(">");

        sourceSeparator = new JLabel();
        sourceSeparator.setBounds(170,6,50,20);
        sourceSeparator.setForeground(Color.WHITE);
        sourceSeparator.setFont(new Font("Times New Roman",Font.BOLD,18));
        sourceSeparator.setText(">");

        buttonsSeparator = new JSeparator();
        buttonsSeparator.setOrientation(SwingConstants.VERTICAL);
        buttonsSeparator.setBounds(840,0,20,30);
        buttonsSeparator.setForeground(Color.WHITE);

        runButton = new JButton();
        runButton.setBounds(860,0,32,30);
        runButton.setIcon(new ImageIcon("images/play_bigger.png"));
        runButton.setFocusable(false);

        debugButton = new JButton();
        debugButton.setBounds(910,0,32,30);
        debugButton.setIcon(new ImageIcon("images/debug_bigger.png"));
        debugButton.setFocusable(false);

        talkButton = new JButton();
        talkButton.setBounds(960,0,32,30);
        talkButton.setIcon(new ImageIcon("images/talk.png"));
        talkButton.setFocusable(false);

        //Body Stuff

        bodySeparator = new JSeparator();
        bodySeparator.setBounds(250,28,50,490);
        bodySeparator.setForeground(Color.BLACK);
        bodySeparator.setOrientation(SwingConstants.VERTICAL);

        projectInformationPanel = new JPanel();
        projectInformationPanel.setBounds(0,30,255,30);
        projectInformationPanel.setBackground(new Color(241,142,143));
        projectInformationPanel.setLayout(null);
        projectInformationPanel.setVisible(true);

        projectTitleLabel = new JLabel();
        projectTitleLabel.setBounds(0,3,150,28);
        projectTitleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        projectTitleLabel.setFont(new Font("Times New Roman",Font.BOLD,18));
        projectTitleLabel.setForeground(Color.BLACK);
        projectTitleLabel.setText("Project");
        projectTitleLabel.setIcon(new ImageIcon("images/ide.png"));

        downArrow = new JLabel();
        downArrow.setBounds(98,4,32,32);
        downArrow.setIcon(new ImageIcon("images/down_arrow.png"));

        downArrow2 = new JLabel();
        downArrow2.setBounds(0,56,32,32);
        downArrow2.setIcon(new ImageIcon("images/arrow-down.png"));

        projectNameLabel2 = new JLabel();
        projectNameLabel2.setBounds(22,62,150,20);
        projectNameLabel2.setHorizontalAlignment(SwingConstants.LEFT);
        projectNameLabel2.setFont(new Font("Times New Roman",Font.BOLD,15));
        projectNameLabel2.setForeground(Color.BLACK);
        projectNameLabel2.setText("UntiledProject");
        projectNameLabel2.setIcon(new ImageIcon("images/folder.png"));

        rightArrow = new JLabel();
        rightArrow.setBounds(22,80,31,32);
        rightArrow.setIcon(new ImageIcon("images/right_arrow.png"));

        outputFolderLabel = new JLabel();
        outputFolderLabel.setBounds(50,86,150,20);
        outputFolderLabel.setHorizontalAlignment(SwingConstants.LEFT);
        outputFolderLabel.setFont(new Font("Times New Roman",Font.BOLD,13));
        outputFolderLabel.setForeground(Color.BLACK);
        outputFolderLabel.setText("Out");
        outputFolderLabel.setIcon(new ImageIcon("images/folder-pink.png"));

        downArrow3 = new JLabel();
        downArrow3.setBounds(22,100,32,32);
        downArrow3.setIcon(new ImageIcon("images/arrow-down.png"));

        sourceFolderLabel= new JLabel();
        sourceFolderLabel.setBounds(50,106,150,20);
        sourceFolderLabel.setHorizontalAlignment(SwingConstants.LEFT);
        sourceFolderLabel.setFont(new Font("Times New Roman",Font.BOLD,13));
        sourceFolderLabel.setForeground(Color.BLACK);
        sourceFolderLabel.setText("Src");
        sourceFolderLabel.setIcon(new ImageIcon("images/folder-young.png"));

        classFileLabel = new JLabel();
        classFileLabel.setBounds(52,128,150,20);
        classFileLabel.setFont(new Font("Times New Roman",Font.BOLD,13));
        classFileLabel.setForeground(Color.BLACK);
        classFileLabel.setText("UntiledFile");
        classFileLabel.setIcon(new ImageIcon("images/gem_class.png"));

        logoImageLabelButton = new JLabel();
        logoImageLabelButton.setBounds(5,298,255,255);
        logoImageLabelButton.setIcon(new ImageIcon("images/transparent_logo.png"));

        logoImageLabelTop = new JLabel();
        logoImageLabelTop.setBounds(5,115,255,255);
        logoImageLabelTop.setIcon(new ImageIcon("images/transparent_logo.png"));
        logoImageLabelTop.setVisible(false);

        runDebugGifLabel = new JLabel();
        runDebugGifLabel.setBounds(3,290,255,255);
        runDebugGifLabel.setIcon(new ImageIcon("gif/run.gif"));
        runDebugGifLabel.setVisible(false);

        //Right Side of Body - TextArea

        /*writeCodeTextArea = new JTextArea();
        writeCodeTextArea.setBounds(250,50,500,500);
        writeCodeTextArea.setWrapStyleWord(true);
        writeCodeTextArea.setEditable(true);
        writeCodeTextArea.setFont(new Font("Times New Roman",Font.PLAIN,14));

        lineNumbers = new JTextArea("1");
        lineNumbers.setEditable(false); */

        //Right side of body - TextArea
        /*private JTextArea writeCodeTextArea;
        private JTextArea lineNumbers; */
        StyleContext styleContext = new StyleContext();
        Style defaultStyle = styleContext.getStyle(StyleContext.DEFAULT_STYLE);
        MutableAttributeSet cwStyle = style(new Color(32, 28, 172));

        SimpleAttributeSet rightAlign = new SimpleAttributeSet();
        //StyleConstants.setAlignment(rightAlign, StyleConstants.ALIGN_RIGHT);

        writeCodeTextPane = new JTextPane(new ReservedWordStyledDocument(defaultStyle, cwStyle));
        writeCodeTextPane.setFont(new Font("Times New Roman",Font.PLAIN,14));

        document = writeCodeTextPane.getDocument();

        lineNumbersTextPane = new JTextPane();
        lineNumbersTextPane.setBackground(new Color(241,142,143));
        lineNumbersTextPane.setEditable(false);
        lineNumbersTextPane.setParagraphAttributes(rightAlign, true);

        writeCodeScrollPane = new JScrollPane();
        writeCodeScrollPane.setBounds(257,31,741,485);
        writeCodeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        writeCodeScrollPane.getViewport().setBackground(Color.WHITE);
        writeCodeScrollPane.setBorder(null);

        //Bottom Side of body

        displayRunResultsTextArea = new JTextArea();
        displayRunResultsTextArea.setBounds(5,5,1000,200);
        displayRunResultsTextArea.setEditable(false);
        displayRunResultsTextArea.setWrapStyleWord(true);
        displayRunResultsTextArea.setFont(new Font("Times New Roman",Font.PLAIN,14));
        displayRunResultsTextArea.setBackground(Color.BLACK);
        displayRunResultsTextArea.setForeground(Color.RED);
        displayRunResultsTextArea.setCaretColor(new Color(39,122,117));

        debugResultsTextArea = new JTextArea();
        debugResultsTextArea.setBounds(5,5,1000,200);
        debugResultsTextArea.setEditable(false);
        debugResultsTextArea.setWrapStyleWord(true);
        debugResultsTextArea.setFont(new Font("Times New Roman",Font.PLAIN,14));
        debugResultsTextArea.setBackground(Color.BLACK);
        debugResultsTextArea.setForeground(Color.WHITE);
        debugResultsTextArea.setCaretColor(new Color(39,122,117));

        displayRunResultsScrollPane = new JScrollPane();
        displayRunResultsScrollPane.setBounds(0,5,979,129);
        displayRunResultsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        displayRunResultsScrollPane.setBorder(null);

        debugResultsScrollPane = new JScrollPane();
        debugResultsScrollPane.setBounds(0,5,979,129);
        debugResultsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        debugResultsScrollPane.setBorder(null);

        //treeViewer = new TreeViewer(Arrays.asList(Functions.snbParser.getRuleNames()),Functions.antlrAST);
        //treeViewer.setScale(1.5);

        runResultsPanelTab = new JPanel();
        runResultsPanelTab.setBackground(Color.WHITE);
        runResultsPanelTab.setLayout(null);

        debugResultsTab = new JPanel();
        debugResultsTab.setBackground(new Color(241,142,143));
        debugResultsTab.setLayout(null);

        astViewTab = new JPanel();
        astViewTab.setBackground(new Color(100,196,252));
        astViewTab.setLayout(null);

        consoleTabPane = new JTabbedPane();
        consoleTabPane.setBackground(Color.CYAN);
        consoleTabPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        consoleTabPane.setBounds(0,5,1000,180);

        entireConsoleDisplayPanel = new JPanel();
        entireConsoleDisplayPanel.setBackground(new Color(39,122,117));
        entireConsoleDisplayPanel.setLayout(null);
        entireConsoleDisplayPanel.setBounds(0,516,1000,190);
    }

    public void addToFrame() {
        //Menu Items
        fileJMenu.add(newMenuItem);
        fileJMenu.add(fileMenuSeparator);
        fileJMenu.add(saveMenuItem);
        fileJMenu.add(fileMenuSeparator2);
        fileJMenu.add(printMenuItem);

        editMenu.add(undoMenuItem);
        editMenu.add(editMenuSeparator);
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        editMenu.add(editMenuSeparator2);
        editMenu.add(deleteMenuItem);

        searchMenu.add(findMenuItem);
        searchMenu.add(replaceMenuItem);

        runMenu.add(runMenuItem);
        runMenu.add(debugMenuItem);

        snbMenuBar.add(fileJMenu);
        snbMenuBar.add(editMenu);
        snbMenuBar.add(searchMenu);
        snbMenuBar.add(viewMenu);
        snbMenuBar.add(navigateMenu);
        snbMenuBar.add(runMenu);
        snbMenuBar.add(helpMenu);

        this.setJMenuBar(snbMenuBar);

        actionButtonPanel.add(projectNameLabel);
        actionButtonPanel.add(projectNameSeparator);
        actionButtonPanel.add(sourceLabel);
        actionButtonPanel.add(sourceSeparator);
        actionButtonPanel.add(fileNameLabel);
        actionButtonPanel.add(buttonsSeparator);
        actionButtonPanel.add(runButton);
        actionButtonPanel.add(debugButton);
        actionButtonPanel.add(talkButton);

        this.getContentPane().add(actionButtonPanel);
        this.getContentPane().add(bodySeparator);

        projectInformationPanel.add(projectTitleLabel);
        projectInformationPanel.add(downArrow);

        this.getContentPane().add(projectInformationPanel);
        this.getContentPane().add(downArrow2);
        this.getContentPane().add(projectNameLabel2);
        this.getContentPane().add(rightArrow);
        this.getContentPane().add(outputFolderLabel);
        this.getContentPane().add(downArrow3);
        this.getContentPane().add(sourceFolderLabel);
        this.getContentPane().add(classFileLabel);
        this.getContentPane().add(logoImageLabelButton);
        this.getContentPane().add(logoImageLabelTop);
        this.getContentPane().add(runDebugGifLabel);

        /*writeCodeScrollPane.getViewport().add(writeCodeTextArea);
        writeCodeScrollPane.setRowHeaderView(lineNumbers); */
        writeCodeScrollPane.getViewport().add(writeCodeTextPane);
        writeCodeScrollPane.setRowHeaderView(lineNumbersTextPane);
        this.getContentPane().add(writeCodeScrollPane);

        displayRunResultsScrollPane.getViewport().add(displayRunResultsTextArea);
        runResultsPanelTab.add(displayRunResultsScrollPane);

        debugResultsScrollPane.getViewport().add(debugResultsTextArea);
        debugResultsTab.add(debugResultsScrollPane);

        //astViewTab.add(treeViewer);

        consoleTabPane.addTab("Run",new ImageIcon("images/play.png"),runResultsPanelTab);
        consoleTabPane.addTab("Debug", new ImageIcon("images/debug.png"),debugResultsTab);
        consoleTabPane.addTab("Tree", new ImageIcon("images/tree.png"),astViewTab);

        entireConsoleDisplayPanel.add(consoleTabPane);

        this.getContentPane().add(entireConsoleDisplayPanel);
    }

    public void registerListeners() {
        saveMenuItem.addActionListener(e -> {
            ImageIcon save = new ImageIcon("gif/save_gif.gif");
            JOptionPane.showMessageDialog(null,"Saved","Saving",JOptionPane.INFORMATION_MESSAGE,
                    save);
        });

        newMenuItem.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Creating...","New Project",JOptionPane.INFORMATION_MESSAGE,gem);
            this.dispose();
            new MainApplication("SNB Compiler").setVisible(true);
        });

        deleteMenuItem.addActionListener(e -> {
            int reply = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete?",
                    "Delete",JOptionPane.YES_NO_OPTION);
            if (reply==JOptionPane.YES_OPTION) {
                //writeCodeTextArea.setText("");
                writeCodeTextPane.setText("");
            }
        });

        runMenuItem.addActionListener(e -> {
            //Voice attempting to run
            run();
        });

        debugMenuItem.addActionListener(e -> {
            debugCalled = true;
            //Send "compiling and running to the text area
            debugResultsTextArea.append("Attempting to Compile and Run \n");
            run();
            //Show the different functions it went through
        });

        runButton.addActionListener(e -> {
            //Same thing as runMenuItem
            //Voice attempting to run
            run();
        });

        debugButton.addActionListener(e -> {
            debugCalled = true;
            //same thing as debugMenuItem
            debugResultsTextArea.append("Attempting to Compile and Run \n");
            run();
        });

        talkButton.addActionListener(e -> {
            //Speech recognition stuff
        });

        /*writeCodeTextArea.getDocument().addDocumentListener(new DocumentListener() {
            public String getText() {
                int caretPosition = writeCodeTextArea.getDocument().getLength();
                Element root = writeCodeTextArea.getDocument().getDefaultRootElement();
                StringBuilder text = new StringBuilder("1" + System.getProperty("line.separator"));

                for (int i=2; i<root.getElementIndex(caretPosition) +2; i++) {
                    text.append(i).append(System.getProperty("line.separator"));
                }
                return text.toString();
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                lineNumbers.setText(getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                lineNumbers.setText(getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                lineNumbers.setText(getText());
            }
        }); */

        document.addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                lineNumbers();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                lineNumbers();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                lineNumbers();
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null,"Are you sure you want to close compiler?",
                        "Close",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,gem);

                if (option == JOptionPane.YES_OPTION) {
                    try {
                        soundEffects.playMp3("goodbye");
                    }catch (JavaLayerException javaLayerException) {
                        javaLayerException.printStackTrace();
                    }
                    JOptionPane.showMessageDialog(null,"Closing...","Close",JOptionPane.INFORMATION_MESSAGE,gem);
                    e.getWindow().dispose();
                }
            }
        });
    }

    private void lineNumbers() {
        try {
            String words = writeCodeTextPane.getText();

            //Plain Style
            SimpleAttributeSet plain = new SimpleAttributeSet();
            StyleConstants.setFontFamily(plain, "Times New Roman");
            StyleConstants.setFontSize(plain,14);

            //Bold Style
            SimpleAttributeSet bold = new SimpleAttributeSet();
            StyleConstants.setBold(bold,true);

            // Remove all from document
            Document document = lineNumbersTextPane.getDocument();
            document.remove(0,document.getLength());

            //Calculating the number of lines
            int length = words.length() - words.replaceAll(("\n"), "").length()+1;

            //Adding line-numbers
            for (int index=1; index<=length; index++) {
                //Non-bold line numbers
                if (index < length) {
                    document.insertString(document.getLength(), index + "\n", plain);
                }
                else {
                    //Last line number bold
                    document.insertString(document.getLength(), index + "\n", bold);
                }
            }
        }catch (BadLocationException badLocationException){
            badLocationException.printStackTrace();
        }
    }

    private void getProjectAndFileNames() {
        JTextField projectNameTextField = new JTextField();
        JTextField classFileNameTextField = new JTextField();
        ImageIcon gem = new ImageIcon("gif/gem_gif.gif");

        Object[] inputFields = {
                "Project Name", projectNameTextField,
                "Class File Name", classFileNameTextField
        };

        int option = JOptionPane.showConfirmDialog(null, inputFields, "Create Project", JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,gem);

        if (option == JOptionPane.OK_OPTION) {
            //Check if nothing is in text field
            if (projectNameTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Creating project with default name");
            }else {
                projectNameLabel.setText(projectNameTextField.getText());
                projectNameLabel2.setText(projectNameTextField.getText());
            }

            if (classFileNameTextField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,"Creating class with default name");
            }else {
                fileNameLabel.setText(classFileNameTextField.getText());
                classFileLabel.setText(classFileNameTextField.getText());
            }

        }else {
            JOptionPane.showMessageDialog(null,"Creating project and class with default names.");
        }
    }

    private String createFile() {
        String fileName = classFileLabel.getText() + ".snb";

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            //bufferedWriter.write(writeCodeTextArea.getText());
            bufferedWriter.write(writeCodeTextPane.getText());
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileName;
    }

    private void run() {
        try {
            soundEffects.playMp3("run");
        }catch (JavaLayerException javaLayerException) {
            javaLayerException.printStackTrace();
        }
        //Call the run functions
        displayRunResultsTextArea.setText("");
        displayRunResultsTextArea.setForeground(Color.RED);
        debugResultsTextArea.setText("");
        displayRunGUI();
        String fileName = createFile();
        Functions.compileAndRunProgram(fileName);
    }

    private void displayRunGUI() {
        logoImageLabelTop.setVisible(true);
        logoImageLabelButton.setVisible(false);
        runDebugGifLabel.setVisible(true);
    }

    private static MutableAttributeSet style(Color color) {
        MutableAttributeSet s = new SimpleAttributeSet();

        StyleConstants.setLineSpacing(s, -0.2f);
        StyleConstants.setBold(s, true);
        StyleConstants.setItalic(s, false);
        StyleConstants.setForeground(s, color);

        return s;
    }
}
