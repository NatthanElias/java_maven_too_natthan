/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.avaliacao.primeiraetapa.semestre_2022_2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 20221PF.CC0015
 */
public class Questao2 {
    private Map<Integer, java.util.Calendar> mapDados = new HashMap();
    private SimpleDateFormat formatadorData;
    private java.util.Calendar data_util_date;
    
    private String dadosString = "{codigo:10, data:'2022-01-31'}; {codigo:20, data:'1999-10-1'};{codigo:30, data:'1994-06-15'}";
    
    public Questao2(){
        manipulacaoStrings();
        mostra();
    }
    private void manipulacaoStrings(){
        String d[] = dadosString.split(";");
        formatadorData = new SimpleDateFormat("yyyy-MM-dd"); 
        
        int i=0;
        
        while(i < d.length){
            try{
                
                String codigo = d[i].substring(d[i].indexOf(":")+1,d[i].indexOf(","));
                String data = d[i].substring(d[i].indexOf(":",d[i].indexOf(","))+2, d[i].indexOf("'}"));
            
                Calendar x = Calendar.getInstance();
            
                x.setTimeInMillis(formatadorData.parse(data).getTime());                        
 
                mapDados.put(Integer.parseInt(codigo), x);
                
            }catch(Exception e){
                e.printStackTrace();
            }
            i++;
        }
    }
    
    public void mostra() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        for(Map.Entry<Integer, Calendar> m : mapDados.entrySet()) {
            Calendar data = m.getValue();
            System.out.println("Chave:"+m.getKey() + "Valor: " + sdf.format(data.getTime()));
        }
        
    }
    
    public static void main(String args[]){
       new Questao2();
        
    
    }
    
}
