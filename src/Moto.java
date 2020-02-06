public class Moto extends Veicolo
{
    private int num_posti;

    public Moto(int numero_matricola, String proprietario, int num_posti) throws IllegalArgumentException
    {
        super(numero_matricola, proprietario);
        try
        {
            setNumPosti(num_posti);
            if(num_posti==0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Valori inseriti non corretti!\n"+e);
        }
    }

    public int getNumPosti() {
        return num_posti;
    }

    public void setNumPosti(int num_posti) {
        this.num_posti = num_posti;
    }

    public String toString() {
        return "Moto{" +
                "num_posti=" + num_posti +
                '}';
    }
}
