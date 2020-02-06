import java.lang.*;

public class Veicolo extends Exception
{
    private int numero_matricola;
    private String proprietario;

    public Veicolo(int numero_matricola, String proprietario) throws IllegalArgumentException
    {
        try {
            setNumMatricola(numero_matricola);
            setProprietario(proprietario);
            if(numero_matricola==0)
            {
                throw new IllegalArgumentException();
            }
            else if(proprietario=="")
            {
                throw new IllegalArgumentException();
            }
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Valori inseriti non corretti!\n"+e);
        }
    }

    public int getNumero_matricola() {
        return numero_matricola;
    }

    public void setNumMatricola(int numero_matricola) {
        this.numero_matricola = numero_matricola;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String toString() {
        return "Veicolo{" +
                "numero_matricola=" + numero_matricola +
                ", proprietario='" + proprietario + '\'' +
                '}';
    }
}
