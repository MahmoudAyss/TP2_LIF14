
package ihm;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import tp1.henni.pkg11303891_ayssami.pkg11513923.Article;
import java.util.*;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.UIManager;

/**
 *
 * @author Aïssa
 */
public class FenetrePrincipale extends javax.swing.JFrame {

    private Article articleSelectionne = new Article(null, null);
    private Vector<Article> vectorArticles = new Vector();
    
    public FenetrePrincipale() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        jMenu.setVisible(true);
        jActualites.setVisible(false);
        jAjouterArticle.setVisible(false);
        jDetailsArticle.setVisible(false);
        jTextArea1.setLineWrap(true);
        jTextArea1.setWrapStyleWord(true);
        jChampsCorps.setLineWrap(true);
        jChampsCorps.setWrapStyleWord(true);
        jScrollPane1.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jGris);
        buttonGroup.add(jJaune);
        buttonGroup.add(jBlanc);
        jJaune.setSelected(true);
        Article premierArticle = new Article("Recrutement des enseignants chercheurs 2016", "du 8 février 2016 au 10 mars 2016\n" +
            "\n" +
            "L'affichage des profils de postes mis au recrutement est effectif le 8 février 2016 via l'application FIDIS du portail GALAXIE. Les inscriptions via la même application sont donc possibles du 8 février 2016 au 10 mars 2016, 16 heures (heure de Paris).");
        vectorArticles.add(premierArticle);
        //Nouvelle ligne
        System.out.println("Hello world!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jActualites = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jAjouterArticle = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jChampsTitre = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jChampsCorps = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jDetailsArticle = new javax.swing.JPanel();
        jLabelTitre = new javax.swing.JLabel();
        jScrollPaneCorps = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jJaune = new javax.swing.JRadioButtonMenuItem();
        jBlanc = new javax.swing.JRadioButtonMenuItem();
        jGris = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TP1-HENNI-11303891_AYSSAMI-11513923");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setPreferredSize(new java.awt.Dimension(634, 470));

        jButton7.setText("Actualités >");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Tomuss...");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Plan...");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Spiral...");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setText("Emploi du temps...");
        jButton11.setToolTipText("");
        jButton11.setPreferredSize(new java.awt.Dimension(107, 29));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("MENU");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1326, 1326, 1326)
                        .addComponent(jLabel7)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel7))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("MENU");

        jLabel4.setText("Bienvenue à Lyon 1 ! De quoi avez vous besoin ?");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm/images/lyon1.png"))); // NOI18N

        javax.swing.GroupLayout jMenuLayout = new javax.swing.GroupLayout(jMenu);
        jMenu.setLayout(jMenuLayout);
        jMenuLayout.setHorizontalGroup(
            jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jMenuLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jMenuLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(146, 146, 146)
                        .addComponent(jLabel8))
                    .addGroup(jMenuLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel4))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jMenuLayout.setVerticalGroup(
            jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jActualites.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jActualitesComponentShown(evt);
            }
        });

        jList1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.setFixedCellHeight(70);
        jList1.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("ACTUALITÉS");

        jButton3.setText("< Retour MENU");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("+ Ajouter article");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Double clique sur l'article pour lire");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ihm/images/computermouse50.png"))); // NOI18N

        javax.swing.GroupLayout jActualitesLayout = new javax.swing.GroupLayout(jActualites);
        jActualites.setLayout(jActualitesLayout);
        jActualitesLayout.setHorizontalGroup(
            jActualitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jActualitesLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jActualitesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jActualitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jActualitesLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1))
                    .addGroup(jActualitesLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(jActualitesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jActualitesLayout.setVerticalGroup(
            jActualitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jActualitesLayout.createSequentialGroup()
                .addGroup(jActualitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jActualitesLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jActualitesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jActualitesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("AJOUTER ARTICLE");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jChampsCorps.setColumns(20);
        jChampsCorps.setRows(5);
        jScrollPane2.setViewportView(jChampsCorps);

        jLabel5.setText("Titre de l'article (30 caractères maximum conseillés)");

        jLabel6.setText("Corps de l'article");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel6)
                .addContainerGap(390, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jChampsTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(63, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel6)
                .addContainerGap(212, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel5)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jChampsTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(22, Short.MAX_VALUE)))
        );

        jButton2.setText("< Retour ACTUALITÉS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Valider");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jAjouterArticleLayout = new javax.swing.GroupLayout(jAjouterArticle);
        jAjouterArticle.setLayout(jAjouterArticleLayout);
        jAjouterArticleLayout.setHorizontalGroup(
            jAjouterArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAjouterArticleLayout.createSequentialGroup()
                .addContainerGap(430, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jAjouterArticleLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jAjouterArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jAjouterArticleLayout.createSequentialGroup()
                    .addGap(38, 38, 38)
                    .addGroup(jAjouterArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jAjouterArticleLayout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addComponent(jButton2)))
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        jAjouterArticleLayout.setVerticalGroup(
            jAjouterArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jAjouterArticleLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 348, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
            .addGroup(jAjouterArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jAjouterArticleLayout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton2)
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        jDetailsArticle.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jDetailsArticleComponentHidden(evt);
            }
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jDetailsArticleComponentShown(evt);
            }
        });

        jLabelTitre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitre.setText("TITRE DE L'ARTICLE");

        jScrollPaneCorps.setToolTipText("");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(242, 238, 147));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPaneCorps.setViewportView(jTextArea1);

        jButton1.setText("< Retour ACTUALITÉS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDetailsArticleLayout = new javax.swing.GroupLayout(jDetailsArticle);
        jDetailsArticle.setLayout(jDetailsArticleLayout);
        jDetailsArticleLayout.setHorizontalGroup(
            jDetailsArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDetailsArticleLayout.createSequentialGroup()
                .addGroup(jDetailsArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDetailsArticleLayout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jButton1))
                    .addGroup(jDetailsArticleLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(jDetailsArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDetailsArticleLayout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jScrollPaneCorps, javax.swing.GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
                    .addGap(32, 32, 32)))
        );
        jDetailsArticleLayout.setVerticalGroup(
            jDetailsArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDetailsArticleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitre, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(369, 369, 369)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDetailsArticleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDetailsArticleLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jScrollPaneCorps, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addGap(51, 51, 51)))
        );

        jMenu1.setText("Ficher");

        jMenuItem1.setText("Quitter");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Préférences");

        jMenu3.setText("Couleur de fond de l'article");

        jJaune.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_MASK));
        jJaune.setSelected(true);
        jJaune.setText("Jaune");
        jJaune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jJauneActionPerformed(evt);
            }
        });
        jMenu3.add(jJaune);

        jBlanc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jBlanc.setSelected(true);
        jBlanc.setText("Blanc");
        jBlanc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlancActionPerformed(evt);
            }
        });
        jMenu3.add(jBlanc);

        jGris.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jGris.setSelected(true);
        jGris.setText("Gris");
        jGris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGrisActionPerformed(evt);
            }
        });
        jMenu3.add(jGris);

        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jAjouterArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jActualites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jDetailsArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jAjouterArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jActualites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jDetailsArticle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       int n = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment quitter le programme ?"
               + "\n Attention, tous les articles seront effacés", "Quitter le programme",
               JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, 
               UIManager.getIcon("OptionPane.warningIcon") );
        
        if(n==JOptionPane.OK_OPTION){
            System.exit(0);
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jAjouterArticle.setVisible(false);
        jActualites.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jActualites.setVisible(false);
        jAjouterArticle.setVisible(true);
        jChampsTitre.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jDetailsArticle.setVisible(false);
        jActualites.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jActualites.setVisible(false);
        jMenu.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(jChampsTitre.getText().length()!=0 && jChampsCorps.getText().length()!=0){
            Article a = new Article(jChampsTitre.getText(), jChampsCorps.getText());
            vectorArticles.add(a);
            jAjouterArticle.setVisible(false);
            jChampsCorps.setText("");
            jChampsTitre.setText("");
            jActualites.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "Merci d'entrer les deux champs");
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        jMenu.setVisible(false);
        jActualites.setVisible(true);

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("https://tomuss.univ-lyon1.fr/"));
        }
        catch(URISyntaxException | IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        try {
            Desktop.getDesktop().browse(new URI("http://oscar.univ-lyon1.fr/appli-externe/plan/plans/plan_campus_ouest.html"));
        }
        catch(URISyntaxException | IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("http://spiralconnect.univ-lyon1.fr/"));
        }
        catch(URISyntaxException | IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("http://adelb.univ-lyon1.fr/"));
        }
        catch(URISyntaxException | IOException e)
        {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());

        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jActualitesComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jActualitesComponentShown
        Iterator<Article> it = vectorArticles.iterator();
        DefaultListModel listmodel = new DefaultListModel();
        
        while (it.hasNext()) { 
            listmodel.addElement(it.next().getTitre());    
        }
        
        jList1.setModel(listmodel);
    }//GEN-LAST:event_jActualitesComponentShown

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

        if(jList1.getSelectedIndices().length==1){
            if (evt.getClickCount() == 2) {
                // Double-click detected
                int index = jList1.locationToIndex(evt.getPoint());
                articleSelectionne=vectorArticles.elementAt(index);
                jActualites.setVisible(false);
                jDetailsArticle.setVisible(true);
            }
        }
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jDetailsArticleComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDetailsArticleComponentShown
        jLabelTitre.setText(articleSelectionne.getTitre());
        jTextArea1.setText(articleSelectionne.getCorps());
        jTextArea1.setCaretPosition(0);
        jMenu3.setEnabled(true);
    }//GEN-LAST:event_jDetailsArticleComponentShown

    private void jJauneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jJauneActionPerformed
        jTextArea1.setBackground(new Color(242, 238, 147));
    }//GEN-LAST:event_jJauneActionPerformed

    private void jDetailsArticleComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDetailsArticleComponentHidden
        jMenu3.setEnabled(false);
    }//GEN-LAST:event_jDetailsArticleComponentHidden

    private void jBlancActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlancActionPerformed
        jTextArea1.setBackground(Color.WHITE);
    }//GEN-LAST:event_jBlancActionPerformed

    private void jGrisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGrisActionPerformed
        jTextArea1.setBackground(Color.GRAY);
    }//GEN-LAST:event_jGrisActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int n = JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment quitter le programme ?"
               + "\n Attention, tous les articles seront effacés", "Quitter le programme",
               JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, 
               UIManager.getIcon("OptionPane.warningIcon") );
        
        if(n==JOptionPane.OK_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenetrePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenetrePrincipale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jActualites;
    private javax.swing.JPanel jAjouterArticle;
    private javax.swing.JRadioButtonMenuItem jBlanc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextArea jChampsCorps;
    private javax.swing.JTextField jChampsTitre;
    private javax.swing.JPanel jDetailsArticle;
    private javax.swing.JRadioButtonMenuItem jGris;
    private javax.swing.JRadioButtonMenuItem jJaune;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTitre;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPaneCorps;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
