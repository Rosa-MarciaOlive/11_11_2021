public class TesteLampada {

    public static void main(String[] args) {
        //criar objeto
        Lampada l=new Lampada();
        l.ligar();

        //Verificação da condição da lampada
        if(l.isSituacaoLampada()){
            System.out.println("Lampada ligada");
        }else
            System.out.println("Lampada desligada");
    }
}
