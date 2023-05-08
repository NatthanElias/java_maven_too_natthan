
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 20221PF.CC0015
 */
public class AvaliacaoPratica1 {
    private String dados_q1 = "1,2,3,4,5,6,a,b,c";
    private static String dados_q3[] = {"04/12", "01/01/2006", "02/02/2000",
    "03/03/2002"};
    private java.text.SimpleDateFormat sdf = null;
    private java.util.List<Integer> dados = new java.util.ArrayList();
    private java.util.Calendar data_util_date;
    private Map<Integer, java.util.Calendar> calendario = new HashMap();
    
    
    
    public void questao1() {
        int i=0;
        String d[] = dados_q1.split(",");
        
        while(i < d.length){
            
            try {
                dados.add(Integer.parseInt(d[i]));
            }
            catch(NumberFormatException e) {
                dados.add(0);
            }
            
            i++;
        }
        
        for(int j = 0; j< dados.size(); j++) {
            System.out.print(dados.get(j)+", ");
        }
    }
    
    public void questao3(String[] str) {
        sdf = new SimpleDateFormat("dd/MM/yyyy");
        int i = 0;
        int aux = 0;
        
        while(i < dados_q3.length){
            try{
                String data = dados_q3[i].substring(aux, dados_q3[i].length());
            
                Calendar x = Calendar.getInstance();
                //System.out.println(data);
                x.setTimeInMillis(sdf.parse(data).getTime());
                
                
                calendario.put(i, x);
            }catch(Exception e){
                Calendar outraData = new GregorianCalendar(1983, 0, 01);
                calendario.put(i, outraData);
            }
            
            i++;
            
        }
        
        for(Map.Entry<Integer, Calendar> m : calendario.entrySet()) {
            Calendar data = m.getValue();
            System.out.println("Chave:"+m.getKey() + " Data: " + sdf.format(data.getTime()));
        }
        
    }
    
    public AvaliacaoPratica1() {
        questao1();
        //questao3(dados_q3);
    }
    
    private AvaliacaoPratica1(String[] str) {
        questao3(str);
    }
    public static void main(String args[]){
        AvaliacaoPratica1 x = new AvaliacaoPratica1();
        System.out.println(x);
        
        AvaliacaoPratica1 z =new AvaliacaoPratica1(dados_q3);
    }
    
}
