//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Editora editoraLivro = new Editora();
        editoraLivro.nome = "Rocco";
        editoraLivro.email = "adm@Rocco.com";
        editoraLivro.site = "Rocco.com";


        //Criar um objeto -> Instanciar um objeto
        Livro MeuLivro = new Livro ();
        MeuLivro.titulo = "harry potter";
        MeuLivro.autor = "j.k.";
        MeuLivro.editora = editoraLivro;
        MeuLivro.paginas = 208;
        MeuLivro.resumo = "é um bruxo...";
        MeuLivro.tipoCapa = "comum";
        MeuLivro.valor = 35.99;
        System.out.println(MeuLivro.titulo + " escrito por " + MeuLivro.autor + " custa " + MeuLivro.valor
        +  " publicado por " + MeuLivro.editora.nome);


        Livro meuLivro2 = new Livro();
        meuLivro2.titulo = "harry potter 2";
        meuLivro2.autor = "j.k.";
        meuLivro2.editora = editoraLivro;
        meuLivro2.paginas = 288;
        MeuLivro.resumo = "é um bruxo...";
        meuLivro2.tipoCapa = "dura";
        meuLivro2.valor = 37.99;
        System.out.println(meuLivro2.titulo + " escrito por " + meuLivro2.autor + " custa " + meuLivro2.valor);


    }

}