public class Auto extends Veicolo
{
    private String tipologia;

    public Auto(int numero_matricola, String proprietario, String tipologia) throws IllegalArgumentException
    {
        super(numero_matricola, proprietario);

        try {
            setTipologia(tipologia);
            if(tipologia=="")
            {
                throw new IllegalArgumentException();
            }
        }

        catch(IllegalArgumentException e)
        {
            System.out.println("Valori inseriti non corretti!\n"+e);
        }
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String toString() {
        return "Auto{" +
                "tipologia='" + tipologia + '\'' +
                '}';
    }
}
