# API-FIPE-Carros
Consumindo Web Service API

Javadoc --- \dist\javadoc

Importar a biblioteca POO2-WebService.jar encontrada em \dist

Importar gson encontrada em \lib

Exemplo de utilização 


public class teste {

    public static List<Marca> listaMarca = new ArrayList<Marca>();
    public static List<Modelo> listaModelo = new ArrayList<Modelo>();
    public static List<ModeloAno> listaModeloAno = new ArrayList<ModeloAno>();

    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        FipeMetodos fipe = new FipeMetodos();
        int idModelo = 0, idMarca = 0;
        String idModeloAno = "", nomeMarca = "";
        int op = 0;
        if (fipe.conexao()) {
            do {
                System.out.println("");
                System.out.println("-------------------------------------------");
                System.out.println("1 - Marca");
                System.out.println("2 - Modelos da Marca");
                System.out.println("3 - Modelos fabricados do modelo escolhido");
                System.out.println("4 - Carro resultante");
                System.out.println("5 - Salvar marca em .json");
                System.out.println("6 - Salvar modelos em .json");
                System.out.println("7 - Limpar marcas");
                System.out.println("8 - Limpar Modelos");
                System.out.println("9 - Sair");
                System.out.println("-------------------------------------------");
                System.out.println("");
                op = entrada.nextInt();

                switch (op) {

                    case 1:
                        // Marcas 
                        listaMarca = fipe.cria();
                        System.out.println("Marca escolhida " + listaMarca.get(0).getName());
                        nomeMarca = listaMarca.get(0).getName();
                        idMarca = fipe.idMarca(listaMarca, listaMarca.get(0).getName());
                        break;

                    case 2:
                        // ModeloS 
                        if (idMarca != 0) {
                            listaModelo = fipe.criaModelo(idMarca);
                            idModelo = fipe.idModelo(listaModelo, listaModelo.get(0).getName());

                            System.out.println("Modelo escolhido " + listaModelo.get(0).getName());
                        } else {
                            System.out.println("Escolha a marca!");
                        }
                        break;

                    case 3:
                        // Modelos de diferentes anos 
                        if (idMarca != 0 && idModelo != 0) {
                            listaModeloAno = fipe.cria(idMarca, idModelo);
                            String nome = listaModeloAno.get(0).getName() + " " + listaModeloAno.get(0).getVeiculo();
                            idModeloAno = fipe.id(listaModeloAno, nome);
                            System.out.println("Modelo fabricado do modelo escolhido " + listaModeloAno.get(0).getName());
                        } else {
                            System.out.println("Escolha uma marca e/ou modelo antes!");

                        }
                        break;

                    case 4:
                        // Veiculo resultante daquele Modelo
                        if (idMarca != 0 && idModelo != 0 && (!idModeloAno.equals(""))) {
                            Carro Veiculo = fipe.cria(idMarca, idModelo, idModeloAno);
                            System.out.println("NOME " + Veiculo.getName());
                            System.out.println("MODELO/ANO " + Veiculo.getAno_modelo());
                            System.out.println("MARCA " + Veiculo.getMarca());
                            System.out.println("COMBUSTIVEL " + Veiculo.getCombustivel());
                            System.out.println("PREÇO " + Veiculo.getPreco());
                            System.out.println("REFERENCIA " + Veiculo.getReferencia());
                        } else {
                            System.out.println("Escolha uma marca, modelo e/ou modeloAno antes");
                        }
                        break;
                    case 5:
                        System.out.println("Insira o diretorio");
                        String pasta = entrada.next();
                        fipe.exportaMarca(pasta, listaMarca);
                        System.out.println("Salvo em " + pasta);
                        break;
                    case 6:
                        System.out.println("Insira o diretorio");
                        pasta = entrada.next();
                        fipe.exportaModelo(pasta, listaModelo, nomeMarca);
                        System.out.println("Salvo em " + pasta);
                        break;
                    case 7:
                        listaMarca.clear();
                        System.out.println("Limpo");
                        break;
                    case 8:
                        listaModelo.clear();
                        System.out.println("Limpo");
                        break;
                }
            } while (op != 9);
        }
    }
}

