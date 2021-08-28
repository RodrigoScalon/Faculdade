public class Account {

    private String name; //variável instância

    public void setName (String name) //metodo para definir o nome no objeto
    {

        this.name = name; //armazena o nome

    }
    public String getName() //metodo para recuperar o nome do objeto
    {
        return name; // retorna o valor do nome para o chamador
    }

}