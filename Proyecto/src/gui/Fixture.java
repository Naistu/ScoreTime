/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author agus
 */
public class Fixture extends javax.swing.JFrame {
    private Elements fecha,equip1,rst,equip2,tabla,tabla2;
    
        public HashMap<String, String> pags = new HashMap<String, String>(){
    {
      put("Liga Argentina","http://www.resultados-futbol.com/primera_division_argentina");  
      put("Liga BBVA","http://www.resultados-futbol.com/primera");  
      put("Premier League","http://www.resultados-futbol.com/premier");  
      put("Serie A","http://www.resultados-futbol.com/serie_a");  
      put("Bundesliga","http://www.resultados-futbol.com/bundesliga");  
    }
};
    
        public HashMap<String, String> nums = new HashMap<String, String>(){
    {
      put("1","/grupo1/jornada1");   
      put("2","/grupo1/jornada2");   
      put("3","/grupo1/jornada3");   
      put("4","/grupo1/jornada4");   
      put("5","/grupo1/jornada5");   
      put("6","/grupo1/jornada6");   
      put("7","/grupo1/jornada7");   
      put("8","/grupo1/jornada8");   
      put("9","/grupo1/jornada9");   
      put("10","/grupo1/jornad10");   
      put("11","/grupo1/jornada11");   
      put("12","/grupo1/jornada12");   
      put("13","/grupo1/jornada13");   
      put("14","/grupo1/jornada14");   
      put("15","/grupo1/jornada15");   
      put("16","/grupo1/jornada16");   
      put("17","/grupo1/jornada17");   
      put("18","/grupo1/jornada18");   
      put("19","/grupo1/jornada19");   
      put("20","/grupo1/jornada20");   
      put("21","/grupo1/jornada21");   
      put("22","/grupo1/jornada22");   
      put("23","/grupo1/jornada23");   
      put("24","/grupo1/jornada24");   
      put("25","/grupo1/jornada25");   
      put("26","/grupo1/jornada26");   
      put("27","/grupo1/jornada27");   
      put("28","/grupo1/jornada28");   
      put("29","/grupo1/jornada29");   
      put("30","/grupo1/jornada30");   
      put("31","/grupo1/jornada31");   
      put("32","/grupo1/jornada32");   
      put("33","/grupo1/jornada33");   
      put("34","/grupo1/jornada34");   
      put("35","/grupo1/jornada35");   
      put("36","/grupo1/jornada36");   
      put("37","/grupo1/jornada37");   
      put("38","/grupo1/jornada38");   
    }
};
        
                public HashMap<String, String> pagequipo = new HashMap<String, String>(){
    {
      put("San Lorenzo","http://www.bdfa.com.ar/plantel-San-Lorenzo-19.html");  
      put("Boca Juniors","http://www.bdfa.com.ar/plantel-Boca-Juniors-6.html");
      put("Belgrano","http://www.bdfa.com.ar/plantel-Belgrano-5.html");
      put("Aldosivi","http://www.bdfa.com.ar/plantel-Aldosivi-23.html");
      put("Argentinos","http://www.bdfa.com.ar/plantel-Argentinos-Juniors-4.html");
      put("Arsenal Sarandí","http://www.bdfa.com.ar/plantel-Arsenal-1034.html");
      put("Atletico Rafaela","http://www.bdfa.com.ar/plantel-Atletico-Rafaela-1035.html");
      put("Banfield","http://www.bdfa.com.ar/plantel-Banfield-41.html");
      put("Colón","http://www.bdfa.com.ar/plantel-Col%C3%B3n-8.html");
      put("Crucero Norte","http://www.bdfa.com.ar/plantel-Crucero-del-Norte-2518.html");
      put("Defensa Justicia","http://www.bdfa.com.ar/plantel-Defensa-y-Justicia-1036.html");
      put("Estudiantes","http://www.bdfa.com.ar/plantel-Estudiantes-9.html");
      put("Gimnasia Plata","http://www.bdfa.com.ar/plantel-Gimnasia-y-Esgrima-10.html");
      put("Godoy Cruz","http://www.bdfa.com.ar/plantel-Godoy-Cruz-68.html");
      put("CA Huracán","http://www.bdfa.com.ar/plantel-Hurac%C3%A1n-11.html");
      put("Independiente","http://www.bdfa.com.ar/plantel-Independiente-12.html");
      put("Lanús","http://www.bdfa.com.ar/plantel-Lanus-13.html");
      put("Newell's Boys","http://www.bdfa.com.ar/plantel-Newell-Old-Boys-15.html");
      put("Nueva Chicago","http://www.bdfa.com.ar/plantel-Nueva-Chicago-85.html");
      put("Olimpo","http://www.bdfa.com.ar/plantel-Olimpo-86.html");
      put("Quilmes","http://www.bdfa.com.ar/plantel-Quilmes-90.html");
      put("Racing Club","http://www.bdfa.com.ar/plantel-Racing-Club-16.html");
      put("River Plate","http://www.bdfa.com.ar/plantel-River-Plate-17.html");
      put("Rosario Central","http://www.bdfa.com.ar/plantel-Rosario-Central-18.html");
      put("San Lorenzo","http://www.bdfa.com.ar/plantel-San-Lorenzo-19.html");
      put("Martín Juan","http://www.bdfa.com.ar/plantel-San-Mart%C3%ADn-96.html");
      put("Sarmiento","http://www.bdfa.com.ar/plantel-Sarmiento-100.html");
      put("Temperley","http://www.bdfa.com.ar/plantel-Temperley-105.html");
      put("Tigre","http://www.bdfa.com.ar/plantel-Tigre-106.html");
      put("Unión Santa Fe","http://www.bdfa.com.ar/plantel-Uni%C3%B3n-21.html");
      put("Vélez Sarsfield","http://www.bdfa.com.ar/plantel-Velez-Sarsfield-22.html");
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
      put("Sporting de Gijón","falta");
      put("Las Palmas","falta");
      //Faltan Sportin gijon y Las Palmas.
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
      put("FC ingolstadt 04","falta");
      put("FC Augsburg","falta");
      //Faltan Augsburg y Ingolstadt 04
      put("Juventus","http://www.bdfa.com.ar/plantel-Juventus-116.html");
      put("Atalanta","http://www.bdfa.com.ar/plantel-Atalanta-250.html");
      put("Bologna","http://www.bdfa.com.ar/plantel-Bologna-111.html");
      put("Chievo","http://www.bdfa.com.ar/plantel-Chievo-Verona-1068.html");
      put("Empoli","http://www.bdfa.com.ar/plantel-Empoli-FC-876.html");
      put("Fiorentina","http://www.bdfa.com.ar/plantel-Fiorentina-114.htmll");
      put("Frosinone","http://www.bdfa.com.ar/plantel-Frosinone-906.html");
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
      put("Cagliari","falta");
      put("Parma","falta");
      put("Cesena","falta");
      // Falta Cagliari, Parma y Cesena
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

    /**
     * Creates new form Fixture
     */
    public Fixture() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        cmbfecha = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pane = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnback.setBackground(java.awt.Color.black);
        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 319, 50, 30));

        cmbliga.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Liga Argentina", "Liga BBVA", "Premier League", "Bundesliga", "Serie A" }));
        cmbliga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbligaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbliga, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        cmbfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbfechaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbfechaMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbfechaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmbfechaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbfechaMouseEntered(evt);
            }
        });
        cmbfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbfechaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 57, 147, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mini.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 360));

        pane.setContentType("text/html"); // NOI18N
        pane.setText("\n");
        jScrollPane2.setViewportView(pane);
        pane.getAccessibleContext().setAccessibleDescription("text/text");

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 570, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
                proyect nuevo= new proyect();
                this.setVisible(false);
                nuevo.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void cmbligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbligaActionPerformed
        String selectedElement = (String) cmbliga.getSelectedItem();
        
        
        if("Liga Argentina".equalsIgnoreCase(selectedElement)){
            
            cmbfecha.removeAllItems();
            
            for (int i=0;i<30;i++){
                cmbfecha.addItem(i+1);
            }
        }
        
        else if("Bundesliga".equalsIgnoreCase(selectedElement)){
            
            cmbfecha.removeAllItems();
            
            for (int i=0;i<34;i++){
                cmbfecha.addItem(i+1);               
            }
        }
        
        else{
            
            cmbfecha.removeAllItems();
            
            for (int i=0;i<38;i++){
                cmbfecha.addItem(i+1);
            }
        }
    }//GEN-LAST:event_cmbligaActionPerformed

    private void cmbfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbfechaActionPerformed
       //int numselec= (int)cmbfecha.getSelectedItem();
       int selectedElement = (int)cmbfecha.getSelectedItem();
       String selectedElement2 = (String) cmbliga.getSelectedItem();
       Document doc;
       String pag1 = null;//liga
       String pag2 = null;//fecha
       String equipv[]= new String[15];
       String equipv2[]= new String[15];
       

       
       for(Map.Entry<String, String> item: pags.entrySet()){
           if(selectedElement2.equalsIgnoreCase(item.getKey())){
               pag1=item.getValue();
           }
       }
       
       for(Map.Entry<String, String> item: nums.entrySet()){
           if(selectedElement==Integer.parseInt(item.getKey())){
               pag2=item.getValue();
           }
       }
       
       try { doc = Jsoup.connect(pag1+pag2)
                    .userAgent("Mozilla")
                    .timeout(10000)
                    .get();
            /*
            fecha=doc.body().getElementsByClass("fecha");
            System.out.println("FECHA:"+fecha.text());
            equip1=doc.body().getElementsByClass("equipo1");
            System.out.println("EQUIPO!:"+equip1.text());
            rst=doc.body().getElementsByClass("clase");
            System.out.println("RST:"+rst.text());
            equip2=doc.body().getElementsByClass("equipo2");
            System.out.println("EQUIPO2:"+equip2.text());
            */
       
       tabla=doc.body().getElementsByClass("table");
       tabla2=doc.body().getElementsByClass("impar vevent");
       
            
            
        if("Liga Argentina".equalsIgnoreCase(selectedElement2)){
            pane.setText(tabla.text());
            System.out.println(tabla);
                
            int e=0;
            int w=0;
            int e2=0;
            int verd=0;
            
            while(verd==0){
                System.out.println("entre1");
                for(Map.Entry<String, String> item: pagequipo.entrySet()){
                    e2++;
                    System.out.println("Comparo:"+item.getKey()+", con:"+equip1.get(w).text()+".");
                    if(equipv[14]!=null)System.out.println("entro y salio");verd=1;
                    if(item.getKey().equalsIgnoreCase(equip1.get(w).text())){
                        System.out.println("dentro del primer if"+"....."+e);
                        equipv[e]=item.getKey();
                        e++;
                        w++;
                        e2=0;
                    }else if(e2==112){
                        System.out.println("dentro del segundo if");
                        w++;
                        e2=0;
                    }
                }
            }
            
            int q=0;
            int r=0;
            int verd2=0;
            int e3=0;
            
            while(verd2==0){
                for(Map.Entry<String, String> item: pagequipo.entrySet()){
                    e3++;
                    System.out.println("Comparo:"+item.getKey()+", con:"+equip2.get(r).text()+".");
                    if(equipv2[14]!=null)verd2=1;
                    if(item.getKey().equalsIgnoreCase(equip2.get(r).text())){
                        System.out.println("dentro del primer if"+"....."+q);
                        equipv2[q]=item.getKey();
                        q++;
                        r++;
                        e3=0;
                    }else if(e3==112){
                        System.out.println("dentro del segundo if");
                        r++;
                        e3=0;
                    }
                }
            }
            
            for(int i=0;i<15;i++){System.out.println(equipv[i]);System.out.println(equipv2[i]);}    
            
            for (int i=0;i<15;i++){
                    System.out.println("Fecha: "+fecha.get(i).text()+", Equipo1: "+equipv[i]+", horario/resultado: "+rst.get(i).text()+", equipo2: "+equipv2[i]);
                }
        }
        
        else if("Bundesliga".equalsIgnoreCase(selectedElement2)){
            
            for (int i=0;i<9;i++){
                System.out.println("Fecha: "+fecha.get(i).text()+", Equipo1: "+equip1.get(i).text()+", horario/resultado: "+rst.get(i).text()+", equipo2: "+equip2.get(i).text());               
            }
        }
        
        else{
            
            for (int i=0;i<10;i++){
                System.out.println("Fecha: "+fecha.get(i).text()+", Equipo1: "+equip1.get(i).text()+", horario/resultado: "+rst.get(i).text()+", equipo2: "+equip2.get(i).text());
            }
        }
            
       
       
       }catch(IOException a){}
    }//GEN-LAST:event_cmbfechaActionPerformed

    private void cmbfechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbfechaMouseClicked

    }//GEN-LAST:event_cmbfechaMouseClicked

    private void cmbfechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbfechaMousePressed
       
    }//GEN-LAST:event_cmbfechaMousePressed

    private void cmbfechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbfechaMouseEntered

    }//GEN-LAST:event_cmbfechaMouseEntered

    private void cmbfechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbfechaMouseExited

    }//GEN-LAST:event_cmbfechaMouseExited

    private void cmbfechaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbfechaMouseReleased

    }//GEN-LAST:event_cmbfechaMouseReleased


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
            java.util.logging.Logger.getLogger(Fixture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fixture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fixture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fixture.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fixture().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox cmbfecha;
    private javax.swing.JComboBox cmbliga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane pane;
    // End of variables declaration//GEN-END:variables
}
