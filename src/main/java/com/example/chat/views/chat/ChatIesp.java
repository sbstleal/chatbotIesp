package com.example.chat.views.chat;

import org.alicebot.ab.Bot;
import org.alicebot.ab.Chat;

public class ChatIesp extends Chat {

    Teatro teatro = new Teatro();

    public ChatIesp(Bot bot) {
        super(bot);
    }

    public String multisentenceRespond(String request) {
        String answer = "";

        if (request.equalsIgnoreCase("menu")) {
            answer = obterMenu();

        } else if (request.contains("1")) {
            answer = "Acesse nosso site, escolha o metódo para ingressar, e seu curso: " +
                    "https://www.iesp.edu.br/ingresso/inscreva-se";

        } else if (request.contains("2 - Exibir Lugares Ocupados")) {

            answer = teatro.obterLugaresOcupados();

        } else if (request.contains("3 - Exibir Lugares Vazios")) {

            answer = teatro.obterLugaresVazios();

        } else if (request.split(":").length == 2) {

            answer = preencherLugar(request);

        } else {
            return super.multisentenceRespond(request);
        }

        return answer;
    }

    public String preencherLugar(String request){
        String[] dadosCadastro = request.split(":");
        String mensagem = teatro.comprarIngresso(dadosCadastro[0].trim(), Integer.parseInt(dadosCadastro[1].trim()));
        return  mensagem;
    }

    private String obterMenu(){
        String menu  = "1 - Faça sua Matrícula";
        menu += " 2 - Verifique seu Desempenho Acadêmico";
        menu += " 3 - Nunca tive contato com Tecnologia, posso iniciar um curso?";
        menu += " 4 - Qual o seu Horário e Calendário Estudantil";
        menu += " 5 - Verifique se possuímos vagas de Estágio";
        menu += " 6 - Como acessar a nossa Plataforma de Estudo? ";

        return menu;
    }

}
