package com.example.chat.views.chat;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;

public class ChatIesp extends Chat {

    public ChatIesp(Bot bot) {
        super(bot);
    }

    public String multisentenceRespond(String request) {
        String answer;

        if (request.equalsIgnoreCase("menu")) {
            answer = obterMenu();

        } else if (request.contains("1")) {
            answer = "Acesse nosso site, escolha o metódo para ingressar, e seu curso: " +
                    "https://www.iesp.edu.br/ingresso/inscreva-se";

        } else if (request.contains("2")) {

            answer = infoAcesso() + " Após logar com" +
                    " sucesso entre na aba Notas e visualize seu desempenho acadêmico.";

        } else if (request.contains("3")) {

            answer =  infoAcesso() + " Após logar com " +
                    "sucesso entre na aba" +
                    " Helpdesk, em seus chamados, e em adicionar você irá criar um novo chamado para " +
                    "análise da coordenação.";

        } else if (request.contains("4")) {

            answer = infoAcesso() + " Após logar com " +
                    "sucesso entre na aba Horário, você visualizará toda seu horário estudantil." +
                    "Para visualizar o calendário estudantil acesse nosso site: " +
                    "https://www.iesp.edu.br/noticias/confira-o-calendario-academico-do-semestre-2022-1";

        } else if (request.contains("5")) {

            answer = "A nossa secretária de Sistemas para Internet e de Gestão de Tecnologia da Informação funciona a partir das 13 horas ás 22 horas " +
                    "e você pode se comunicar através do nosso telefone (83) 2106-3816 | (83) 2106-3879 e " +
                    "e-mail coordsi@iesp.edu.br";

        } else if (request.contains("6")) {

            answer = "Acesse https://classroom.google.com/u/0/h?hl=pt-BR, seu acesso é número da matrícula@iesp.edu.br, " +
                    "exemplo: 123456789@iesp.edu.br, e sua senha seu CPF. Aqui você encontrará todas as disciplinas" +
                    " que você possui, caso não encontre alguma disciplina ou foi incluído em uma disciplina que não identifique em " +
                    " sua grade curricular, por favor contatar a Coordenação de Sistemas para Internet e de Gestão de Tecnologia da Informação";
        } else if (request.contains("7")) {

            answer = "Primeiramente SIM! Tudo depende do seu desenvolvimento, e seus estudos, indicamos que tenha uma base" +
                    "inicial e já possuam conhecimento. Caso não possua nenhum conhecimento será díficil ser aceito.";
        } else if (request.contains("8")) {

            answer = infoAcesso() + " Entre na aba Matrícula, caso esteja fora do período de matrícula. " +
                    "Se for necessário a ingressão em alguma turma entre em contato com sua coordenação.";
        } else if (request.contains("9")) {

            answer = "Não! " + infoAcesso() + " Em Helpdesk, clique em adicionar, na opção setor selecione Gerência Financeira" +
                    ", você irá criar um novo chamado para " +
                    "análise do setor.";
        } else if (request.contains("10")) {

            answer = "Sim! A maioria das disciplinas são dispensadas pois os dois cursos compartilham uma ementa parecida, " +
                    "o aluno pode ingressar como uma segunda graduação na Instituição.";
        } else if (request.contains("11")) {

            answer = "Acesse nosso site e verifique todas as formas de ingresso: https://www.iesp.edu.br/ingresso/inscreva-se";
        } else if (request.contains("12")) {

            answer = "A porcentagem máxima de faltas é 50% das aulas da disciplina," +
                    " para poder abonar o aluno precisa enviar para o e-mail (coordsi@iesp.edu.br) da coordenação " +
                    "com o atestado ou documento que" +
                    "comprove o motivo de sua ausência";
        } else if (request.contains("13")) {

            answer = "O curso de Sistema pra Internet são 5 períodos totalizando 2 anos e meio, " +
                    " o curso de Sistema de Informação são 8 períodos totalizando 4 anos.";
        } else if (request.contains("14")) {

            answer = infoAcesso() + " E envie seus certificados " +
                    "de palestras, cursos, projetos de extensão e entre outros.";
        } else if (request.contains("15")) {

            answer = "É necessário primeiro contatar nossa Coordenação e verificar quais cadeiras serão dispensadas, " +
                    "pois nem todas instituições compartilham uma ementa parecida.";
        }
        else {
            return super.multisentenceRespond(request);
        }

        return answer;
    }

    private String infoAcesso(){
        String menu = "Acesse o portal do Aluno no site https://sistemas.iesp.edu.br/iesponline/, " +
                "caso não possua o seu acesso, clique em Primeiro Acesso e crie.";

        return menu;
    }
    private String obterMenu(){
        String menu  = " 1 - Faça sua Matrícula";
        menu += " 2 - Verifique seu Desempenho Acadêmico";
        menu += " 3 - Como faço para solicitar dispensa das disciplinas?";
        menu += " 4 - Qual o seu Horário e Calendário Estudantil?";
        menu += " 5 - Qual horário consigo falar com a coordenação?";
        menu += " 6 - Como acessar a nossa Plataforma de Estudo? ";
        menu += " 7 - Sou aluno do primeiro período, posso tentar uma vaga de estágio? ";
        menu += " 8 - Como faço pra matricula nas disciplinas para o próximo período? ";
        menu += " 9 - Estou com problemas financeiros, a coordenação do curso soluciona? ";
        menu += " 10 - Se eu concluir o curso de Sistemas para Internet posso cursar Sistemas" +
                "de Informação? ";
        menu += " 11 - Quais as formas de ingresso no curso? ";
        menu += " 12 - Qual a quantidade máxima de faltas e como abonar essas faltas caso necessite? ";
        menu += " 13 - Quantos períodos tem os cursos de Tecnologia da Informação? ";
        menu += " 14 - Como realizo a baixa das minhas horas complementares? ";
        menu += " 15 - Estou me transferido para UNIESP, quais disciplinas vou cursar? ";

        return menu;
    }

}
