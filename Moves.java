public class Moves {
    
    private String nameMoves;
    private int damage;

    public Moves(String nameMoves, int damage){
        this.nameMoves = nameMoves;
        this.damage = damage;
    }

    public String getNameMoves(){
        return nameMoves;
    }
    
    public int getDamage(){
        return damage;
    }

    public void setNameMoves(String nameMoves){
        this.nameMoves = nameMoves;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public String toString(){
        return "mossa: "+nameMoves+"    danno: "+damage;
    }


}
