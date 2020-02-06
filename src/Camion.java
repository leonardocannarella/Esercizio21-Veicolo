public class Camion extends Veicolo
{
    private int num_assi;

    public Camion(int numero_matricola, String proprietario, int num_assi) throws IllegalArgumentException
    {
        super(numero_matricola, proprietario);
        try
        {
            setNumAssi(num_assi);
            if(num_assi==0)
            {
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Valori inseriti non corretti!\\n\"+e");
        }
    }

    public int getNumAssi() {
        return num_assi;
    }

    public void setNumAssi(int num_assi) {
        this.num_assi = num_assi;
    }

    public String toString() {
        return "Camion{" +
                "num_assi=" + num_assi +
                '}';
    }
}
