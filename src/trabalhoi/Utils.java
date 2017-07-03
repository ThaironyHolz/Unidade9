package trabalhoi;
/**
 * Funções gerais
 */
public class Utils {
    /**
     * Retorna true caso o numero seja primo;
     * 
     * @param num Valor a verificar
     * @return 
     */
    public static boolean primo(int num) {
        boolean is = true;
        int conta = 2;
        while (conta <= (num/2) && is) {
            if (num % conta == 0) {
                is = false;
            }
            conta ++;
        }
        return is;
    }

    /**
     * Retorna true caso a data enviada seja valida
     * 
     * @param d Dia
     * @param m Mes
     * @param a Ano
     * @return 
     */
    public static boolean validarData( int d, int m, int a) {
        boolean correto = true;
        int[] dias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (a < 0 || m < 1 || m > 12) {
            correto = false;
        } else {
            // valida o dia
            if (a%4 == 0 && (a%100 != 0 || a%400 == 0)) {
                dias[1] = 29;
            }
            if (d < 1 || d > dias[m-1]) {
                correto = false;
            }
        }
        return correto;
    }
    
    /**
     * Retorna qual o maior dos 3 numeros
     * 
     * @param a valor 1
     * @param b valor 2
     * @param c valor 3
     * @return 
     */
    public static int maiorDeTres(int a, int b , int c) {
        int maior;
        maior = Math.max( Math.max( a, b ), c );
        return maior;
    }
    
    /**
     * Retorna o fatorial do numero recebido
     * 
     * @param num valor a fatorar
     * @return 
     */
    public static int fatorial(int num) {
        int fat=1;
        for (int x = 2; x <= num; x ++) {
            fat = fat * x;
            
        }
        return fat;
    }
    
    /**
     * Valida o CPF, verificando seu dígito.
     * Retorna True para validação confirmada.
     * 
     * @param cpf
     * @return 
     */
    public static boolean validarCPF( double cpf ) {
        boolean retorno = false;
        int a,b,c,d,e,f,g,h,i,dv1,dv2,dv1_,dv2_;
        a = (int)(cpf/10000000000.0) % 10;
        b = (int)(cpf/1000000000) % 10;
        c = (int)(cpf/100000000) % 10;
        d = (int)(cpf/10000000) % 10;
        e = (int)(cpf/1000000) % 10;
        f = (int)(cpf/100000) % 10;
        g = (int)(cpf/10000) % 10;
        h = (int)(cpf/1000) % 10;
        i = (int)(cpf/100) % 10;
        dv1 = (int)((cpf/10) % 10);
        dv2 = (int)((cpf/1) % 10);
        
        dv1_ = (a*1 + b*2 + c*3 + d*4 + e*5 + f*6 + g*7 + h*8 + i*9) % 11;
        if (dv1_ == 10) {
            dv1_ = 0;
        }
        dv2_ = (a*0 + b*1 + c*2 + d*3 + e*4 + f*5 + g*6 + h*7 + i*8 + dv1_*9) % 11;
        if (dv2_ == 10) {
            dv2_ = 0;
        }
        if (dv1 == dv1_ && dv2 == dv2_) {
            retorno = true;
        }
        return retorno;
    }
    
    /**
     * Retorna um numero aleatório entre os 2 numeros enviados.
     * 
     * @param li Inicio do periodo
     * @param ls Fim do Periodo
     * @return 
     */
    public static int random( int li, int ls ) {
        int num;
        num = (int)(Math.random()*(ls-li+1)+li);
        return num;
    }
    
    /**
     * Retorna uma string com o numero enviado escrito por extenso.
     * 
     * @param num Valor a escrever
     * @return 
     */
    public static String gerarExtenso(int num) {
        int u,d;
        
        String extenso = "", conexao;
        String[] unidade,dezena,dezenaespecial;
        
        unidade        = new String[10];
        dezena         = new String[10];
        dezenaespecial = new String[10];
        
        unidade[0] = "";
        unidade[1] = "um";
        unidade[2] = "dois";
        unidade[3] = "tres";
        unidade[4] = "quatro";
        unidade[5] = "cinco";
        unidade[6] = "seis";
        unidade[7] = "sete";
        unidade[8] = "oito";
        unidade[9] = "nove";
        
        dezena[0] = "";
        dezena[1] = "dez";
        dezena[2] = "vinte";
        dezena[3] = "trinta";
        dezena[4] = "quarenta";
        dezena[5] = "cinquenta";
        dezena[6] = "sessenta";
        dezena[7] = "setenta";
        dezena[8] = "oitenta";
        dezena[9] = "noventa";
        
        dezenaespecial[0] = "dez";
        dezenaespecial[1] = "onze";
        dezenaespecial[2] = "doze";
        dezenaespecial[3] = "treze";
        dezenaespecial[4] = "quatorze";
        dezenaespecial[5] = "quinze";
        dezenaespecial[6] = "dezesseis";
        dezenaespecial[7] = "dezessete";
        dezenaespecial[8] = "dezoito";
        dezenaespecial[9] = "dezenove";
        
        if (num >= 1 && num <= 99) {
            d = num / 10;
            u = num % 10;
            
            conexao = "";
            if (d > 0 && u > 0) {
                conexao = " e ";
            }
            
            if (num >= 10 && num <= 19) {
                extenso = dezenaespecial[ u ];
            } else {
                extenso = dezena[ d ] + conexao + unidade[ u ];
            }
        }
        return extenso;
    }
    
    /**
     * Retorna um integer com o numero de vogais da string recebida.
     * 
     * @param x String a ser contada
     * @return 
     */
    public static int contarVogais(String x) {
        int c,v;
        String w;
        x = x.toLowerCase();
        w = "a�����e����i����o�����u����";
        v = 0;
        c = 0;
        while (c < x.length()) {
            if (w.indexOf( x.charAt(c) ) >= 0) {
                v ++;
            }
            c ++;
        }
        return v;
    }
    
    /**
     * Retorna a string recebida invertida.
     * 
     * @param f Valor a inverter
     * @return 
     */
    public static String inverterString( String f ) {
        int c;
        String x = "";
        
        c = f.length()-1;
        while (c >= 0) {
            x = x + f.charAt( c );
            c --;
        }
        return x;
    }
    
    /**
     * Retorna true se a string recebida é palindroma
     * 
     * @param p1 String a verificar
     * @return 
     */
    public static boolean palindromo( String p1 ) {
        boolean retorno = false;
        if (p1.equals( inverterString(p1) ))  // p1 == p2
        {
            retorno = true;
        }
        return retorno;
    }
    
    /**
     * Retorna true se o integer recebido é palindromo.
     * 
     * @param n 
     * @return 
     */
    public static boolean palindromo( int n ) {
        return palindromo(n+"");
    }
    
    /**
     * Espera um tempo para seguir adiante
     * 
     * @param segundos 
     */
    public static void esperar( int segundos ) {
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {}
    }
    
    /**
     * Converte uma string para um Numero inteiro
     * 
     * @param string valor a converter
     * @return 
     */
    public static int converterParaInteiro( String string ) {
        int num = 0;
        try {
            num = Integer.parseInt( string );
        } catch (Exception e) {}
        return num;
    }
    
    /**
     * Converte uma string para um double
     * 
     * @param string string a converter
     * @return 
     */
    public static double converterParaReal( String string ) {
        double num = 0;
        try {
            num = Double.parseDouble( string );
        } catch (Exception e) {}
        return num;
    }
    
    /**
     * Ajusta iniciais para Maiusculo
     * 
     * @param texto
     * @return 
     */
    public static String AjustaTexto( String texto ) {
        texto = texto.toLowerCase() + " ";

        String retorno = "";

        for (String s: texto.split("\\ "))
        {
            retorno += " " + Character.toUpperCase(s.charAt(0)) +
                       s.substring(1, s.length());

        }

        return retorno.trim();
    }  
    
    /**
     * Retorna o nome do estado
     * 
     * @param Sigla
     * @return 
     */
    public static String RetornaNomeEstado( String Sigla )     {
        if (Sigla.equals("AC"))
        {
            return "Acre";
        }
        else if (Sigla.equals("AL"))
        {
            return "Alagoas";
        }
        else if (Sigla.equals("AM"))
        {
            return "Amazonas";
        }
        else if (Sigla.equals("AP"))
        {
            return "Amapá";
        }
        else if (Sigla.equals("BA"))
        {
            return "Bahia";
        }
        else if (Sigla.equals("CE"))
        {
            return "Ceará";
        }
        else if (Sigla.equals("DF"))
        {
            return "Distrito Federal";
        }
        else if (Sigla.equals("ES"))
        {
            return "Espírito Santo";
        }
        else if (Sigla.equals("GO"))
        {
            return "Goiás";
        }
        else if (Sigla.equals("MA"))
        {
            return "Maranhão";
        }
        else if (Sigla.equals("MG"))
        {
            return "Minas Gerais";
        }
        else if (Sigla.equals("MS"))
        {
            return "Mato Grosso do Sul";
        }
        else if (Sigla.equals("MT"))
        {
            return "Mato Grosso";
        }
        else if (Sigla.equals("PA"))
        {
            return "Pará";
        }
        else if (Sigla.equals("PB"))
        {
            return "Paraíba";
        }
        else if (Sigla.equals("PE"))
        {
            return "Pernambuco";
        }
        else if (Sigla.equals("PI"))
        {
            return "Piauí";
        }
        else if (Sigla.equals("PR"))
        {
            return "Paraná";
        }
        else if (Sigla.equals("RJ"))
        {
            return "Rio de Janeiro";
        }
        else if (Sigla.equals("RN"))
        {
            return "Rio Grande do Norte";
        }
        else if (Sigla.equals("RO"))
        {
            return "Rondônia";
        }
        else if (Sigla.equals("RR"))
        {
            return "Roraima";
        }
        else if (Sigla.equals("RS"))
        {
            return "Rio Grande do Sul";
        }
        else if (Sigla.equals("SC"))
        {
            return "Santa Catarina";
        }
        else if (Sigla.equals("SE"))
        {
            return "Sergipe";
        }
        else if (Sigla.equals("SP"))
        {
            return "São Paulo";
        }
        else if (Sigla.equals("TO"))
        {
            return "Tocantins";
        }
        else if (Sigla.equals("EX"))
        {
            return "Exterior";
        }
        else return "Sigra indefinida";
   }  
    
}