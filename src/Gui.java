import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Objects;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

public class Gui extends javax.swing.JFrame {

    // Atributos
    Archivos info = new Archivos();
    ArrayList<Planeta> PlanetasPublicos;
    Planeta Planeta1c;
    Planeta Planeta2c;
    Cientificos SelectedCTF;

    public Gui() {
        PlanetasPublicos = new ArrayList<>();
        CrearPublicos();
        initComponents();
        FillComboBox();

        PublicBtn.setSelected(false);
        try {
            SelectedCTF = info.Encontrar(CajaScientific.getItemAt(0).toString());
            CrearArbol(PlanetasPublicos);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Planeta getPublicPlanet(String nombre) {
        for (Planeta p : PlanetasPublicos) {

            if (p.toString().equals(nombre)) {
                return p;
            }
        }
        return null;
    }

    public void FillComboBox() {

        ArrayList<Cientificos> Lista = info.getScientific();
        String[] Nombres = new String[Lista.size()];
        for (int i = 0; i < Lista.size(); i++) {

            Nombres[i] = Lista.get(i).toString();
        }
        CajaScientific.setModel(new DefaultComboBoxModel<>(Lista.toArray()));
    }

    public void CrearPublicos() {
        PlanetasPublicos.add(new Terrestre("Mercurio", 5000, 13000, 400, 300));
        PlanetasPublicos.add(new Terrestre("Venus", 100000, 15000, 640, 260));
        PlanetasPublicos.add(new Terrestre("Tierra", 140000, 17000, 760, 570));
        PlanetasPublicos.add(new Terrestre("Marte", 90000, 90000, 360, 360));
        PlanetasPublicos.add(new Terrestre("Jupiter", 400000, 40000, 340, 310));
        PlanetasPublicos.add(new Terrestre("Saturno", 300000, 30000, 560, 450));
        PlanetasPublicos.add(new Terrestre("Urano", 200000, 20000, 670, 690));
        PlanetasPublicos.add(new Terrestre("Neptuno", 200000, 20000, 840, 900));
    }

    public void CrearArbol(ArrayList<Planeta> p) {
        DefaultTreeModel model = (DefaultTreeModel) treePlanets.getModel();
        DefaultMutableTreeNode node = new DefaultMutableTreeNode();
        for (Planeta planet : p) {
            node.add(new DefaultMutableTreeNode(planet.toString()));
        }
        model.setRoot(node);
        model.reload();
    }

    public void fillBox() {

    }

    // <editor-fold default-state="collapsed" desc="Generated Code">
    private void initComponents() {

        MenuPlaneta = new javax.swing.JPopupMenu();
        Planeta1 = new javax.swing.JMenuItem();
        Planeta2 = new javax.swing.JMenuItem();
        barraImpacto = new javax.swing.JProgressBar();
        scrollPane = new javax.swing.JScrollPane();
        treePlanets = new javax.swing.JTree();
        PublicBtn = new javax.swing.JCheckBox();
        CajaScientific = new javax.swing.JComboBox<>();
        boton1 = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        planet1 = new javax.swing.JTextField();
        planet2 = new javax.swing.JTextField();
        boton2 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        distancia = new javax.swing.JLabel();
        label2 = new javax.swing.JLabel();
        tiempoImpact = new javax.swing.JLabel();
        barStrenght = new javax.swing.JProgressBar();

        Planeta1.setText("Planeta1");
        Planeta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Planeta1MouseClicked(evt);
            }
        });
        Planeta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta1ActionPerformed(evt);
            }
        });
        MenuPlaneta.add(Planeta1);

        Planeta2.setText("Planeta2");
        Planeta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Planeta2ActionPerformed(evt);
            }
        });
        MenuPlaneta.add(Planeta2);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        barraImpacto.setForeground(new java.awt.Color(51, 45, 102));
        treePlanets.setForeground(new java.awt.Color(204, 255, 204));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        treePlanets.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        treePlanets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArbolPlanetaMouseClicked(evt);
            }
        });
        scrollPane.setViewportView(treePlanets);

        PublicBtn.setText("Public");
        PublicBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PublicBtnStateChanged(evt);
            }
        });
        PublicBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PublicBtnMouseClicked(evt);
            }
        });
        PublicBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicBtnActionPerformed(evt);
            }
        });

        CajaScientific.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{" "}));
        CajaScientific.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CajaCientificosItemStateChanged(evt);
            }
        });
        CajaScientific.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CajaCientificosMouseClicked(evt);
            }
        });
        CajaScientific.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajaCientificosActionPerformed(evt);
            }
        });

        boton1.setText("Registrar Cientificos");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameFieldActionPerformed(evt);
            }
        });

        planet1.setEditable(false);
        planet1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecteP1ActionPerformed(evt);
            }
        });

        planet2.setEditable(false);

        boton2.setText("Iniciar");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label1.setText("Distancia:");

        label2.setText("Tiempo de impacto:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(37, 37, 37)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(planet1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                                                        .addComponent(planet2, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addGap(40, 40, 40)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(3, 3, 3)
                                                                                .addComponent(distancia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(tiempoImpact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                .addContainerGap())
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(boton1)
                                                                .addGap(83, 230, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(CajaScientific, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(barStrenght, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                                                        .addComponent(PublicBtn, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(barraImpacto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(barraImpacto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(barStrenght, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(planet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label1)
                                                        .addComponent(distancia, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(planet2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label2)
                                                        .addComponent(tiempoImpact, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(31, 31, 31)
                                                .addComponent(CajaScientific, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(23, 23, 23)
                                                .addComponent(boton2)
                                                .addGap(18, 18, 18)
                                                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(boton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(PublicBtn)
                                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        info.addScientific(nameField.getText());
        FillComboBox();
    }

    private void PublicBtnStateChanged(javax.swing.event.ChangeEvent evt) {

    }

    private void ArbolPlanetaMouseClicked(java.awt.event.MouseEvent evt) {

        if (SwingUtilities.isRightMouseButton(evt)) {
            if (!treePlanets.isSelectionEmpty()) {
                MenuPlaneta.show(treePlanets, evt.getX(), evt.getY());
            }
        }
    }

    private void NameFieldActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void CajaCientificosItemStateChanged(java.awt.event.ItemEvent evt) {

        CrearArbol(info.Encontrar(Objects.requireNonNull(CajaScientific.getSelectedItem()).toString()).getDescubrimientos());
        SelectedCTF = info.Encontrar(CajaScientific.getSelectedItem().toString());
        System.out.println(CajaScientific.getSelectedItem().toString());
    }

    private void PublicBtnActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void Planeta1MouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void Planeta1ActionPerformed(java.awt.event.ActionEvent evt) {

        planet1.setText(Objects.requireNonNull(treePlanets.getSelectionPath()).getLastPathComponent().toString());
        System.out.println("Seleccione el planeta 1");
        if (PublicBtn.isSelected()) {
            System.out.println("Publico seleccionado");
            Planeta1c = getPublicPlanet(planet1.getText());
        } else {
            Planeta1c = SelectedCTF.Encontrar(planet1.getText());
            System.out.println("Privado seleccionado");
        }
    }

    private void Planeta2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        planet2.setText(Objects.requireNonNull(treePlanets.getSelectionPath()).getLastPathComponent().toString());
        System.out.println("Selecione el planeta 2");
        if (PublicBtn.isSelected()) {
            System.out.println("Publico seleccionado");
            Planeta2c = getPublicPlanet(planet2.getText());
        } else {
            System.out.println("Privado seleccionado");
            Planeta2c = SelectedCTF.Encontrar(planet2.getText());
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        System.out.println("Colisionando");
        Colision colide = new Colision();
        colide.start();
    }

    public void Calculos(double dist, long time, double masa) {
        double velocidad = Math.pow((dist / time), 2);
        double e = (masa * velocidad) / 2;
        Random r = new Random();
        barStrenght.setMaximum((int) (r.nextInt((int) (2 * e)) + e));
        barStrenght.setValue((int) e);

        double percent = barStrenght.getPercentComplete();
        if (percent > 0.0 && percent <= 0.5) {
            barStrenght.setForeground(Color.GREEN);
        } else if (percent > 0.5 && percent <= 0.75) {
            barStrenght.setForeground(Color.YELLOW);
        } else if (percent > 0.75 && percent < 0.9) {
            barStrenght.setForeground(Color.RED);
        } else {
            barStrenght.setForeground(Color.BLUE);
        }
    }

    private void CajaCientificosActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void PublicBtnMouseClicked(java.awt.event.MouseEvent evt) {

        if (PublicBtn.isSelected()) {
            CrearArbol(PlanetasPublicos);
        } else {
            CrearArbol(SelectedCTF.getDescubrimientos());
        }
    }

    private void CajaCientificosMouseClicked(java.awt.event.MouseEvent evt) {

        PublicBtn.setSelected(false);

        planet1.setText("");
        planet2.setText("");

    }

    private void SelecteP1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    public double distancia(double x1, double y1, double x2, double y2) {
        System.out.println(x1 + " " + y1 + " " + x2 + " " + y2);

        double a = Math.pow(x2 - x1, 2);
        double b = Math.pow(y2 - y1, 2);
        System.out.println(a + " " + b);
        return Math.sqrt(a + b);
    }

    class Colision extends Thread {

        public void run() {
            tiempoImpact.setText("0");
            boolean crear = false;
            barraImpacto.setValue(0);

            int dist = 0;

            Cientificos cients = info.Encontrar(Objects.requireNonNull(CajaScientific.getSelectedItem()).toString());

            try {
                dist = (int) distancia(Planeta1c.getX(), Planeta1c.getY(), Planeta2c.getX(), Planeta2c.getY());
                distancia.setText("" + dist);

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "Tiene que elegir los planetas");
                stop();
            }

            barraImpacto.setMaximum(dist);
            System.out.println(barraImpacto.getMaximum());
            Calendar time = Calendar.getInstance();
            long milis = time.get(Calendar.MILLISECOND);

            while (barraImpacto.getValue() < barraImpacto.getMaximum()) {
                try {
                    sleep(5);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }
                barraImpacto.setValue(barraImpacto.getValue() + 1);
            }

            time = Calendar.getInstance();

            long result = time.get(Calendar.MILLISECOND) - milis;
            tiempoImpact.setText(result + "");

            Calculos(dist, result, (Planeta1c.getPeso() + Planeta2c.getPeso()));
            if (Planeta1c.getProbabilidad()) {
                System.out.println("Se ha creado un nuevo planeta");
                String nombrePlaneta = "";
                while (!crear) {
                    System.out.println("Que nombre desea asignarle?");
                    JTextField field = new JTextField();
                    JOptionPane.showConfirmDialog(rootPane, field, nombrePlaneta, JOptionPane.DEFAULT_OPTION);

                    if ((SelectedCTF.Encontrar(field.getText()) == null) && (!field.getText().equals(""))) {
                        crear = true;
                        nombrePlaneta = field.getText();
                    }
                }
                double x = (Planeta1c.getX() + Planeta2c.getX()) / 2;
                double y = (Planeta1c.getY() + Planeta2c.getY()) / 2;

                double Peso = (Planeta1c.getPeso() + Planeta2c.getPeso()) / 2;

                double size = (Planeta2c.getSize() + Planeta1c.getSize()) / 2;

                if (Planeta1c instanceof Terrestre) {
                    SelectedCTF.AddPlaneta(new Terrestre(nombrePlaneta, size, Peso, x, y));

                    System.out.println(SelectedCTF.toString());
                    System.out.println(CajaScientific.getSelectedItem().toString());

                } else {
                    SelectedCTF.AddPlaneta(new Gaseoso(nombrePlaneta, size, Peso, x, y));

                }

                try {
                    info.save();
                } catch (IOException ex) {
                    Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {

                System.out.println("No se ha formado otro planeta");
            }
            distancia.setText("0");
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new MetalLookAndFeel());
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
            }
            new Gui().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JTree treePlanets;
    private javax.swing.JComboBox<Object> CajaScientific;
    private javax.swing.JProgressBar barStrenght;
    private javax.swing.JProgressBar barraImpacto;
    private javax.swing.JLabel tiempoImpact;
    private javax.swing.JLabel distancia;
    private javax.swing.JPopupMenu MenuPlaneta;
    private javax.swing.JTextField nameField;
    private javax.swing.JMenuItem Planeta1;
    private javax.swing.JMenuItem Planeta2;
    private javax.swing.JCheckBox PublicBtn;
    private javax.swing.JTextField planet1;
    private javax.swing.JTextField planet2;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label2;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration
}
