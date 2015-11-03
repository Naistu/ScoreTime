/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultListModel;
import org.jsoup.select.Elements;


/**
 *
 * @author agus
 */

public class Plantilla extends javax.swing.JFrame {
    private Elements pos,juga;
    public HashMap<String, String> pags = new HashMap<String, String>(){
    {
      put("Liga Argentina","http://canchallena.lanacion.com.ar/estadisticas/futbol-primera-division/posiciones");  
      put("Liga BBVA","http://canchallena.lanacion.com.ar/estadisticas/futbol-espana/posiciones");  
      put("Premier League","http://canchallena.lanacion.com.ar/estadisticas/futbol-premier-league/posiciones");  
      put("Serie A","http://canchallena.lanacion.com.ar/estadisticas/futbol-italia/posiciones");  
      put("Bundesliga","http://es.fifa.com/world-match-centre/nationalleagues/nationalleague=germany-bundesliga-2000000019/standings/");  
    }
};
        public HashMap<String, String> pagequipo = new HashMap<String, String>(){
    {
      put("San Lorenzo","http://www.bdfa.com.ar/plantel-San-Lorenzo-19.html");  
      put("Boca Juniors","http://www.bdfa.com.ar/plantel-Boca-Juniors-6.html");
      put("Belgrano","http://www.bdfa.com.ar/plantel-Belgrano-5.html");
      put("Aldosivi","http://www.bdfa.com.ar/plantel-Aldosivi-23.html");
      put("Argentinos Juniors","http://www.bdfa.com.ar/plantel-Argentinos-Juniors-4.html");
      put("Arsenal","http://www.bdfa.com.ar/plantel-Arsenal-1034.html");
      put("Atlético Rafaela","http://www.bdfa.com.ar/plantel-Atletico-Rafaela-1035.html");
      put("Banfield","http://www.bdfa.com.ar/plantel-Banfield-41.html");
      put("Colón Santa Fe","http://www.bdfa.com.ar/plantel-Col%C3%B3n-8.html");
      put("Crucero del Norte","http://www.bdfa.com.ar/plantel-Crucero-del-Norte-2518.html");
      put("Defensa y Justicia","http://www.bdfa.com.ar/plantel-Defensa-y-Justicia-1036.html");
      put("Estudiantes La Plata","http://www.bdfa.com.ar/plantel-Estudiantes-9.html");
      put("Gimnasia La Plata","http://www.bdfa.com.ar/plantel-Gimnasia-y-Esgrima-10.html");
      put("Godoy Cruz","http://www.bdfa.com.ar/plantel-Godoy-Cruz-68.html");
      put("Huracán","http://www.bdfa.com.ar/plantel-Hurac%C3%A1n-11.html");
      put("Independiente","http://www.bdfa.com.ar/plantel-Independiente-12.html");
      put("Lanús","http://www.bdfa.com.ar/plantel-Lanus-13.html");
      put("Newell's Old Boys","http://www.bdfa.com.ar/plantel-Newell-Old-Boys-15.html");
      put("Nueva Chicago","http://www.bdfa.com.ar/plantel-Nueva-Chicago-85.html");
      put("Olimpo","http://www.bdfa.com.ar/plantel-Olimpo-86.html");
      put("Quilmes","http://www.bdfa.com.ar/plantel-Quilmes-90.html");
      put("Racing Club","http://www.bdfa.com.ar/plantel-Racing-Club-16.html");
      put("River Plate","http://www.bdfa.com.ar/plantel-River-Plate-17.html");
      put("Rosario Central","http://www.bdfa.com.ar/plantel-Rosario-Central-18.html");
      put("San Lorenzo","http://www.bdfa.com.ar/plantel-San-Lorenzo-19.html");
      put("San Martín de San Juan","http://www.bdfa.com.ar/plantel-San-Mart%C3%ADn-96.html");
      put("Sarmiento","http://www.bdfa.com.ar/plantel-Sarmiento-100.html");
      put("Temperley","http://www.bdfa.com.ar/plantel-Temperley-105.html");
      put("Tigre","http://www.bdfa.com.ar/plantel-Tigre-106.html");
      put("Unión","http://www.bdfa.com.ar/plantel-Uni%C3%B3n-21.html");
      put("Velez Sarfield","http://www.bdfa.com.ar/plantel-Velez-Sarsfield-22.html");
      //Argentina listo.
      put("Barcelona","http://www.bdfa.com.ar/plantel-Barcelona-233.html");
      put("Athletic Club","http://www.bdfa.com.ar/plantel-Athletic-de-Bilbao-1081.html");
      put("Atlético de Madrid","http://www.bdfa.com.ar/plantel-Atl%C3%A9tico-de-Madrid-135.html");
      put("Eibar","http://www.bdfa.com.ar/plantel-Eibar-1726.html");
      put("Córdoba","http://www.bdfa.com.ar/plantel-C%C3%B3rdoba-CF-186.html");
      put("Deportivo de La Coruña","http://www.bdfa.com.ar/plantel-Deportivo-La-Coru%C3%B1a-196.html");
      put("Elche","http://www.bdfa.com.ar/plantel-Elche-CF-161.html");
      put("Getafe","http://www.bdfa.com.ar/plantel-Getafe-FC-258.html");
      put("Granada","http://www.bdfa.com.ar/plantel-Granada-597.html");
      put("Levante","http://www.bdfa.com.ar/plantel-Levante-UD-371.html");
      put("Málaga","http://www.bdfa.com.ar/plantel-M%C3%A1laga-160.html");
      put("Rayo Vallecano","http://www.bdfa.com.ar/plantel-Rayo-Vallecano-142.html");
      put("Celta de Vigo","http://www.bdfa.com.ar/plantel-Real-Club-Celta-130.html");
      put("Real Madrid","http://www.bdfa.com.ar/plantel-Real-Madrid-140.html");
      put("Real Sociedad","http://www.bdfa.com.ar/plantel-Real-Sociedad-340.html");
      put("Sevilla","http://www.bdfa.com.ar/plantel-Sevilla-134.html");
      put("Almería","http://www.bdfa.com.ar/plantel-UD-Almer%C3%ADa-604.html");
      put("Valencia","http://www.bdfa.com.ar/plantel-Valencia-136.html");
      put("Villarreal","http://www.bdfa.com.ar/plantel-Villarreal-302.html");
      put("Sporting de Gijón","http://www.bdfa.com.ar/plantel-Sporting-de-Gij%C3%B3n-200.html");
      put("Las Palmas","http://www.bdfa.com.ar/plantel-UD-Las-Palmas-176.html");
      //Espana listo
      put("1. FC Köln","http://www.bdfa.com.ar/plantel-FC-Koln-546.html"); 
      put("Borussia Dortmund","http://www.bdfa.com.ar/plantel-Borussia-Dortmund-460.html");
      put("FC Bayern München","http://www.bdfa.com.ar/plantel-Bayern-Munich-861.html");
      put("Bayer Leverkusen","http://www.bdfa.com.ar/plantel-Bayer-Leverkusen-269.html");
      put("Borussia Mönchengladbach","http://www.bdfa.com.ar/plantel-Borussia-M%C3%B6nchengladbach-1968.html");
      put("SV Darmstadt 98","http://www.bdfa.com.ar/plantel-Darmstadt-98-540.html");
      put("Schalke 04","http://www.bdfa.com.ar/plantel-FC-Schalke-04-300.html");
      put("Freiburg","http://www.bdfa.com.ar/plantel-Freiburg-390.html");
      put("1.FSV Mainz 05","http://www.bdfa.com.ar/plantel-FSV-Mainz-05-2437.html");
      put("Hamburger SV","http://www.bdfa.com.ar/plantel-Hamburgo-167.html");
      put("Hannover 96","http://www.bdfa.com.ar/plantel-Hannover-96-863.html");
      put("Hertha BSC","http://www.bdfa.com.ar/plantel-Hertha-Berlin-414.html");
      put("SC Paderborn 07","http://www.bdfa.com.ar/plantel-SC-Paderborn-07-2594.html");
      put("VfB Stuttgart","http://www.bdfa.com.ar/plantel-Stuttgart-324.html");
      put("Hoffenheim","http://www.bdfa.com.ar/plantel-TSG-Hoffenheim-4171.html");
      put("Werder Bremen","http://www.bdfa.com.ar/plantel-Werder-Bremen-391.html");
      put("VfL Wolfsburg","http://www.bdfa.com.ar/plantel-Wolfsburg-339.html");
      put("FC Ingolstadt 04","http://www.bdfa.com.ar/plantel-FC-Ingolstadt-5088.html");
      put("FC Augsburg","http://www.bdfa.com.ar/plantel-FC-Augsburg-2589.html");
      put("Eintracht Frankfurt","http://www.bdfa.com.ar/plantel-Eintracht-Frankfurt-541.html");
      //Alemania listo
      put("Juventus","http://www.bdfa.com.ar/plantel-Juventus-116.html");
      put("Atalanta","http://www.bdfa.com.ar/plantel-Atalanta-250.html");
      put("Bologna","http://www.bdfa.com.ar/plantel-Bologna-111.html");
      put("Chievo","http://www.bdfa.com.ar/plantel-Chievo-Verona-1068.html");
      put("Empoli","http://www.bdfa.com.ar/plantel-Empoli-FC-876.html");
      put("Fiorentina","http://www.bdfa.com.ar/plantel-Fiorentina-114.htmll");
      put("Parma","http://www.bdfa.com.ar/plantel-Frosinone-906.html");
      put("Genoa","http://www.bdfa.com.ar/plantel-Genoa-147.html");
      put("Verona","http://www.bdfa.com.ar/plantel-Hellas-Verona-127.html");
      put("Internazionale","http://www.bdfa.com.ar/plantel-Inter-115.html");
      put("Milan","http://www.bdfa.com.ar/plantel-Milan-119.html");
      put("Napoli","http://www.bdfa.com.ar/plantel-Napoli-144.html");
      put("Palermo","http://www.bdfa.com.ar/plantel-Palermo-150.html");
      put("Roma","http://www.bdfa.com.ar/plantel-Roma-123.html");
      put("Sampdoria","http://www.bdfa.com.ar/plantel-Sampdoria-187.html");
      put("Sassuolo","http://www.bdfa.com.ar/plantel-Sassuolo-1318.html");
      put("Lazio","http://www.bdfa.com.ar/plantel-SS-Lazio-117.html");
      put("Torino","http://www.bdfa.com.ar/plantel-Torino-124.html");
      put("Udinese","http://www.bdfa.com.ar/plantel-Udinese-125.html");
      // Falta Cagliari y Cesena
      put("Manchester City","http://www.bdfa.com.ar/plantel-Manchester-City-1101.html");
      put("Arsenal","http://www.bdfa.com.ar/plantel-Arsenal-129.html");
      put("Aston Villa","http://www.bdfa.com.ar/plantel-Aston-Villa-141.html");
      put("Bournemouth","http://www.bdfa.com.ar/plantel-Bournemouth-2083.html");
      put("Chelsea","http://www.bdfa.com.ar/plantel-Chelsea-1675.html");
      put("Crystal Palace","http://www.bdfa.com.ar/plantel-Crystal-Palace-379.html");
      put("Everton","http://www.bdfa.com.ar/plantel-Everton-1350.html");
      put("Leicester City","http://www.bdfa.com.ar/plantel-Leicester-City-279.html");
      put("Liverpool","http://www.bdfa.com.ar/plantel-Liverpool-2240.html");
      put("Manchester United","http://www.bdfa.com.ar/plantel-Manchester-United-188.html");
      put("Newcastle United","http://www.bdfa.com.ar/plantel-Newcastle-United-387.html");
      put("Norwich City","http://www.bdfa.com.ar/plantel-Norwich-City-1981.html");
      put("Southampton","http://www.bdfa.com.ar/plantel-Southampton-832.html");
      put("Stoke City","http://www.bdfa.com.ar/plantel-Stoke-City-1991.html");
      put("Sunderland","http://www.bdfa.com.ar/plantel-Sunderland-294.html");
      put("Swansea City","http://www.bdfa.com.ar/plantel-Swansea-City-F.C.-296.html");
      put("Tottenham Hostpur","http://www.bdfa.com.ar/plantel-Tottenham-Hostpur-218.html");
      put("Watford","http://www.bdfa.com.ar/plantel-Watford-1994.html");
      put("West Bromwich Albion","http://www.bdfa.com.ar/plantel-West-Bromwich-1920.html");
      put("West Ham United","http://www.bdfa.com.ar/plantel-West-Ham-United-1875.html");
      // Inglaterr Listo.  
    }
};
    
    
    public Plantilla() {
        initComponents();
        initListaFiltro();
        this.setLocationRelativeTo(null);
        //UserAgent userAgent = new UserAgent(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnback = new javax.swing.JButton();
        cmbliga = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbequipo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listjuga = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setBackground(java.awt.Color.black);
        btnback.setForeground(java.awt.Color.white);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 60, 30));

        cmbliga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbligaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbliga, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 35, 150, -1));

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Elegir Liga:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Elegir Equipo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 74, -1, -1));

        cmbequipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbequipoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbequipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, -1));

        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Plantilla:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        listjuga.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        listjuga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(listjuga);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 210, 326));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
                proyect nuevo= new proyect();
                this.setVisible(false);
                nuevo.setVisible(true);
                nuevo.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnbackActionPerformed

    
    private void cmbligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbligaActionPerformed
        String selectedElement = (String) cmbliga.getSelectedItem();
        Document doc;
        
        String liga_buscada = null;
        for(Map.Entry<String, String> item: pags.entrySet()){
            if(item.getKey().equals(selectedElement)){
             liga_buscada= item.getValue();
            }
        }
            try { doc = Jsoup.connect(liga_buscada)
                    .userAgent("Mozilla")
                    .timeout(10000)
                    .get();
                if ("Bundesliga".equalsIgnoreCase(selectedElement)){
                    pos= doc.body().getElementsByClass("team");
                    pos.remove(0);
                    System.out.println(pos.text());
                }else{
                    
                    pos= doc.body().getElementsByClass("equipo");
                
                }           
                
                cmbequipo.removeAllItems();
                cmbequipo.addItem(pos.first().text());
                int cant=pos.size();
                System.out.println(cant);
                
                for (int i=0;i<cant;i++){
                    
                    if(!pos.first().text().equalsIgnoreCase(pos.get(i).text())){cmbequipo.addItem(pos.get(i).text());}
                    System.out.println(pos.get(i).text());
                    }
           
            }catch(IOException a){}
        
    }//GEN-LAST:event_cmbligaActionPerformed

    private void cmbequipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbequipoActionPerformed
        String selectedElement = (String) cmbequipo.getSelectedItem();
        Document doc;
        
        if(selectedElement==null)return;
        
        String equip_buscado=null;
        for(Map.Entry<String, String> item: pagequipo.entrySet()){
            //System.out.println("soy el for");
            //System.out.println("item: "+item.getKey()+",valor: "+item.getValue()+", elemento: "+selectedElement.toString());
            
            if(item.getKey().equals(selectedElement)){
             equip_buscado= item.getValue();
             System.out.println(equip_buscado);
            }
        }
            
        listjuga.clearSelection();
            
        try {System.out.println(equip_buscado+"2");
                  doc = Jsoup.connect(equip_buscado)
                    .userAgent("Mozilla")
                    .timeout(10000)
                    .get();
                
                
                juga=doc.getElementsByTag("b");
                int cant=juga.size();
                
                DefaultListModel prelist = new DefaultListModel();
                for (int i=0;i<cant;i++){
                    prelist.addElement(juga.get(i).text());
                   
                    }
                listjuga.setModel(prelist);
           
            }catch(IOException a){}
        
    }//GEN-LAST:event_cmbequipoActionPerformed
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Plantilla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Plantilla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox cmbequipo;
    private javax.swing.JComboBox cmbliga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList listjuga;
    // End of variables declaration//GEN-END:variables

    private void initListaFiltro() {
        cmbliga.removeAllItems();
        for(Map.Entry<String, String> item: pags.entrySet()){
            cmbliga.addItem(item.getKey());
        }
    }
}
