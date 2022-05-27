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

            answer = "Acesse o portal do Aluno no site https://sistemas.iesp.edu.br/iesponline/, você já possui o " +
                    "login? Caso não possua o seu acesso, clique em Primeiro Acesso e crie. Após logar com" +
                    " sucesso entre na aba Notas e visualize seu desempenho acadêmico.";

        } else if (request.contains("3")) {

            answer = "Acesse o portal do Aluno no site https://sistemas.iesp.edu.br/iesponline/, " +
                    "caso não possua o seu acesso, clique em Primeiro Acesso e crie. Após logar com " +
                    "sucesso entre na aba" +
                    " Helpdesk, em seus chamados, e em adicionar você irá criar um novo chamado para " +
                    "análise da coordenação.";

        } else if (request.contains("4")) {

            answer = "Acesse o portal do Aluno no site https://sistemas.iesp.edu.br/iesponline/, " +
                    "caso não possua o seu acesso, clique em Primeiro Acesso e crie. Após logar com " +
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
        } else {
            return super.multisentenceRespond(request);
        }

        return answer;
    }

    private String obterMenu(){
        String menu  = " 1 - Faça sua Matrícula";
        menu += " 2 - Verifique seu Desempenho Acadêmico";
        menu += " 3 - Como faço para solicitar dispensa das disciplinas?";
        menu += " 4 - Qual o seu Horário e Calendário Estudantil?";
        menu += " 5 - Qual horário que consigo fala com a coordenação?";
        menu += " 6 - Como acessar a nossa Plataforma de Estudo? ";

        return menu;
    }

}
