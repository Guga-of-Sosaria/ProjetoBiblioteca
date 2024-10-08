package projetoBiblioteca;

public class Aluno extends Usuario {
    private static final int max_reservas = 3;

    public Aluno(String nome){
        super(nome);
    }

    @Override
    public void reservarItem(Item item) throws ItemIndisponivelException{
        if (getEmprestimos().size() >= max_reservas){
            throw new ItemIndisponivelException("O aluno já reservou a quantidade máxima de itens disponíveis!");
        }
        super.reservarItem(item);
    }
}
