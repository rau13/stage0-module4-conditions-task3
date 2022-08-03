package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        for(char c = 'A'; c <= 'Z'; ++c)
            if(symbol == c){
                System.out.println("English");
            }else{
                System.out.println("Non English");
            }
    }
}

