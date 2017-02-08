package br.com.skillsmap.tests;

import br.com.skillmap.dao.DAO;
import br.com.skillmap.entity.Pergunta;



public class TestEntity {

	public static void main(String[] args) {
		
		/*
		Pergunta p1 = new Pergunta();
		p1.setAreaAtuacao("Enterprise Vault");
		p1.setDescricaoPergunta("Quais s�o os primeiros processos que devem ser executados quando o Add-in do Enterprise Vault n�o aparece no Outlook?");
		p1.setResposta1("Reinstalar o Enterprise Vault, Reiniciar a MV e habilitar o suplemento.");
		p1.setResposta2("Verificar se o acesso foi concedido a mais de 24 horas, executar a bat ResetEVClient e habilitar o Add-in do Outlook.");
		p1.setResposta3("Executar a bat ResetEVClient, habilitar o add-in no outlook e reiniciar a mv.");
		p1.setResposta4("Verificar se o usu�rio possui acesso, reiniciar a MV e reinstalar o Enterprise Vault.");
		p1.setRespostaCorreta("Verificar se o acesso foi concedido a mais de 24horas, executar a bat ResetEVClient e habilitar o Add-in do Outlook.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p1);
		
		
		Pergunta p2 = new Pergunta();
		p2.setAreaAtuacao("Enterprise Vault");
		p2.setDescricaoPergunta("Todos os usu�rios com acesso ao Enteprise Vault est�o inclu�dos em uma pol�tica de armazenamento. Qual � a politica padr�o para os usu�rios ? A pol�tica pode ser alterada?");
		p2.setResposta1("Pol�tica de armazenamento de e-mails recebidos � 15 dias e n�o pode ser alterada.");
		p2.setResposta2("Pol�tica de armazenamento de e-mails recebidos � 30 dias e n�o pode ser alterada.");
		p2.setResposta3("Pol�tica de armazenamento de e-mails recebidos � 30 dias e pode ser alterada.");
		p2.setResposta4("Pol�tica de armazenamento de e-mails recebidos � 20 dias e pode ser alterada.");
		p2.setRespostaCorreta("Pol�tica de armazenamento de e-mails recebidos � 30 dias e pode ser alterada.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p2);
		
		Pergunta p3 = new Pergunta();
		p3.setAreaAtuacao("Enterprise Vault");
		p3.setDescricaoPergunta("Um usu�rio est� cadastrado na pol�tica de armazenamento padr�o do Enterprise Vault, por�m a capacidade da sua mailbox passa do limite de 500MB v�rias vezes durante a semana devido a grande quantidade de e-mails que ele recebe. Sendo assim, abre diversos chamados com problemas de envio e recebimento no Outlook. Qual orienta��o deve ser dada ao usu�rio?");
		p3.setResposta1("Orientar o usu�rio � abrir um chamado para aumentar a cota de 500MB do Outlook.");
		p3.setResposta2("Orientar o usu�rio � abrir um chamado para aumento de espa�o em disco.");
		p3.setResposta3("Orientar o usu�rio � abrir um chamado para trocar a politica de armazenamento do EV para um tempo menor do que a padr�o.");
		p3.setResposta4("Orientar o usu�rio � armazenar manualmente os e-mails no Enterprise Vault todos os dias.");
		p3.setRespostaCorreta("Orientar o usu�rio � abrir um chamado para trocar a politica de armazenamento do EV para um tempo menor do que a padr�o.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p3);

		Pergunta p4 = new Pergunta();
		p4.setAreaAtuacao("Enterprise Vault");
		p4.setDescricaoPergunta("Usu�rios que possuem em sua MV o sistema operacional XP muitas das vezes n�o conseguem acessar o add-in do Enterprise Vault no Outlook. Ap�s clicarem no �cone do EV, ele direciona para a p�gina com uma mensagem de erro com fundo preto na parte superior da tela do Outlook. Esta mensagem informa que h� incompatibilidades ...... Qual � o diagn�stico para o problema?");
		p4.setResposta1("Usu�rio possui a vers�o do Internet Explorer 7 instalado na MV e a solu��o � instalar uma vers�o superior (Internet Explorer 8).");
		p4.setResposta2("O Enterprise Vault n�o funciona no Outlook de quem possui MV com S.O XP.");
		p4.setResposta3("Usu�rio n�o tem o Mozilla Firefox e Chrome instalado em sua MV e a solu��o � instalar os dois navegadores.");
		p4.setResposta4("O problema est� no Office utilizado pelo usu�rio e a solu��o � reparar o software.");
		p4.setRespostaCorreta("Usu�rio possui a vers�o do Internet Explorer 7 instalado na MV e a solu��o � instalar uma vers�o superior (Internet Explorer 8).");
		new DAO<Pergunta>(Pergunta.class).adiciona(p4);
		
		Pergunta p5 = new Pergunta();
		p5.setAreaAtuacao("Enterprise Vault");
		p5.setDescricaoPergunta("Os e-mails arquivados no Enterprise Vault estar�o dispon�veis para consulta durante um determinado tempo. Durante quanto tempo os e-mails armazenados ficam dispon�veis no EV?");
		p5.setResposta1("O Enterprise Vault disponibiliza os e-mails durante 10 anos.");
		p5.setResposta2("O Enterprise Vault disponibiliza os e-mails durante 5 anos.");
		p5.setResposta3("O Enterprise Vault disponibiliza os e-mails durante 1 ano.");
		p5.setResposta4("O Enterprise Vault disponibiliza os e-mails durante 7 anos.");
		p5.setRespostaCorreta("O Enterprise Vault disponibiliza os e-mails durante 7 anos.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p5);
		
		Pergunta p6 = new Pergunta();
		p6.setAreaAtuacao("VDI");
		p6.setDescricaoPergunta("Quantos servidores VDI existem no ItauBBA?");
		p6.setResposta1("1");
		p6.setResposta2("2");
		p6.setResposta3("3");
		p6.setResposta4("4");
		p6.setRespostaCorreta("2");
		new DAO<Pergunta>(Pergunta.class).adiciona(p6);
		
		Pergunta p7 = new Pergunta();
		p7.setAreaAtuacao("VDI");
		p7.setDescricaoPergunta("Qual � a responsabilidade da Opera��o VDI?");
		p7.setResposta1("Resolver qualquer tipo de problema das maquinas virtuais (inclusive problemas de software e sistema operacional).");
		p7.setResposta2("Criar, excluir e gerenciar as maquinas virtuais na camada da infraestrutura.");
		p7.setResposta3("Apenas criar maquinas virtuais.");
		p7.setResposta4("Atuar como suporte terceiro n�vel, auxiliando o time na resolu��o de problemas referente a maquinas virtuais.");
		p7.setRespostaCorreta("Criar, excluir e gerenciar as maquinas virtuais na camada da infraestrutura.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p7);
		
		Pergunta p8 = new Pergunta();
		p8.setAreaAtuacao("VDI");
		p8.setDescricaoPergunta("Quem faz o backup/restore das m�quinas virtuais?");
		p8.setResposta1("Time da Opera��o VDI.");
		p8.setResposta2("Time de Suporte Servidores.");
		p8.setResposta3("Time de Produ��o.");
		p8.setResposta4("Time de Backup.");
		p8.setRespostaCorreta("Time de Backup.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p8);
		
		Pergunta p9 = new Pergunta();
		p9.setAreaAtuacao("VDI");
		p9.setDescricaoPergunta("Quando h� indisponibilidade em um servidor vCenter o que acontece com as maquinas virtuais?");
		p9.setResposta1("As maquinas virtuais ficam indispon�veis, impossibilitando o uso das mesmas deixando os usu�rios indispon�veis.");
		p9.setResposta2("As maquinas virtuais continuam funcionando normalmente, por�m n�o � poss�vel gerencia-las pelo vSphere.");
		p9.setResposta3("As maquinas ficam indispon�veis porem uma contingencia � liberada para o os usu�rios n�o fiquem indispon�veis.");
		p9.setResposta4("Nenhuma das anteriores, servidor vCenter nunca fica indispon�vel.");
		p9.setRespostaCorreta("As maquinas virtuais continuam funcionando normalmente, por�m n�o � poss�vel gerencia-las pelo vSphere.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p9);
		
		
		Pergunta p10 = new Pergunta();
		p10.setAreaAtuacao("VDI");
		p10.setDescricaoPergunta("Em que situa��o n�o recomend�vel o uso de MV?");
		p10.setResposta1("Quando o usu�rio utiliza macros que consome grande quantidade de processamento e mem�ria RAM.");
		p10.setResposta2("Quando o usu�rio salva muitos arquivos em disco (PST, banco de dados em access).");
		p10.setResposta3("Quando o usu�rio usa sistemas que necessitam de muito recurso de v�deo.");
		p10.setResposta4("Nenhuma das anteriores.");
		p10.setRespostaCorreta("Quando o usu�rio usa sistemas que necessitam de muito recurso de v�deo.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p10);		
		
		Pergunta p11 = new Pergunta();
		p11.setAreaAtuacao("Gerais Itau N3");
		p11.setDescricaoPergunta("Qual o procedimento para que o usu�rio saiba quem � seu solicitante de acessos Ita�? ");
		p11.setResposta1("Perguntando ao colega do colaborador.");
		p11.setResposta2("Atrav�s do Portal Corporativo do Ita�.");
		p11.setResposta3("Ligando no Help Desk Itau (8668).");
		p11.setResposta4("Atrav�s do Portal GSI");
		p11.setRespostaCorreta("Atrav�s do Portal GSI");
		new DAO<Pergunta>(Pergunta.class).adiciona(p11);
		
		Pergunta p12 = new Pergunta();
		p12.setAreaAtuacao("Gerais Itau N3");
		p12.setDescricaoPergunta("Uma m�quina Ita� de um Trader est� entrando em estado de hiberna��o a cada 30 minutos sem intera��o e recebendo atualiza��es durante o expediente, qual a causa do problema?");
		p12.setResposta1("Modo de economia de energia ativado.");
		p12.setResposta2("Windows Update Ativo.");
		p12.setResposta3("M�quina recebendo patches pelo SCCM.");
		p12.setResposta4("Nome da m�quina com o padr�o incorreto (Ex: CP-FULANO).");
		p12.setRespostaCorreta("Nome da m�quina com o padr�o incorreto (Ex: CP-FULANO).");
		new DAO<Pergunta>(Pergunta.class).adiciona(p12);
		
		Pergunta p13 = new Pergunta();
		p13.setAreaAtuacao("Gerais Itau N3");
		p13.setDescricaoPergunta("Um colaborador com notebook no dominio dm010cto deseja ter acesso a rede Wireless do Ita�, qual o requisito minimo (alem de uma placa wireless e de um usu�rio de rede v�lido no dominio dm010cto) necess�rio para que o mesmo tenha acesso a rede wireless corporativa?");
		p13.setResposta1("Acesso ao ambiente de produ��o.");
		p13.setResposta2("Acesso � internet.");
		p13.setResposta3("Email com o sufixo Ita� cadastrado no AD.");
		p13.setResposta4("Acesso administrador no notebook.");
		p13.setRespostaCorreta("Email com o sufixo Ita� cadastrado no AD.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p13);
		
		Pergunta p14 = new Pergunta();
		p14.setAreaAtuacao("Gerais Itau N3");
		p14.setDescricaoPergunta("Qual a maneira mais segura de reinstalar a Bloomberg em uma m�quina ap�s o expediente?");
		p14.setResposta1("Perguntar ao usu�rio se o mesmo utiliza B-Unit ou Senha para acessar a Bloomberg e ap�s isso reinstalar.");
		p14.setResposta2("Removendo o software e reinstalando pelo painel de controle.");
		p14.setResposta3("Removendo com Revo.");
		p14.setResposta4("Removendo com o perfil do usu�rio.");
		p14.setRespostaCorreta("Perguntar ao usu�rio se o mesmo utiliza B-Unit ou Senha para acessar a Bloomberg e ap�s isso reinstalar.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p14);
		
		Pergunta p15 = new Pergunta();
		p15.setAreaAtuacao("Gerais Itau N3");
		p15.setDescricaoPergunta("O Excel do colaborador trava com a mensagem de �N�o Respondendo� quando o colaborador abre uma planilha em branco, o que fazer no momento do atendimento?");
		p15.setResposta1("Executar o Excel como administrador.");
		p15.setResposta2("Reinstalar os addins da planilha do usu�rio, reinstalar o Office e certificar-se de que o Service Pack esta atualizado conforme a vers�o do Office.");
		p15.setResposta3("Atualizar o Office para a vers�o mais recente.");
		p15.setResposta4("Chamar Imediatamente o 3� n�vel, pois o mesmo disp�e de um especialista de Excel disponivel e qualificado para solucionar o problema.");
		p15.setRespostaCorreta("Executar o Excel como administrador.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p15);
		
		Pergunta p16 = new Pergunta();
		p16.setAreaAtuacao("Gerais Itau N3");
		p16.setDescricaoPergunta("Uma workstation HP (Modelos Z420 ou Z220) apresenta falta de recursos de mem�ria, o que fazer considerando que a mesma possui 12 gb de mem�ria j� instalada?");
		p16.setResposta1("Adicionar mais 8 GB de mem�ria na m�quina.");
		p16.setResposta2("Efetuar a limpeza de disco.");
		p16.setResposta3("Utilizar o comando gpupdate a fim de atualizar as diretivas de rede e limpar as requisi��es da m�quina do usu�rio.");
		p16.setResposta4("Analisar qual aplica��o esta consumindo mem�ria da m�quina, remover o poss�vel ofensor, reiniciar a m�quina, e reinstalar.");
		p16.setRespostaCorreta("Analisar qual aplica��o esta consumindo mem�ria da m�quina, remover o poss�vel ofensor, reiniciar a m�quina, e reinstalar.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p16);
		
		Pergunta p17 = new Pergunta();
		p17.setAreaAtuacao("Gerais Itau N3");
		p17.setDescricaoPergunta("A EA digital apresenta falha ao executar uma fun��o especifica, s�o exibidos erros de p�gina expirada, a EA trava, etc.Qual a primeira a��o a ser tomada?");
		p17.setResposta1("Reinstalar a EAWEB.");
		p17.setResposta2("Trocar a m�quina para Windows XP pois a fun��o pode n�o ser compat�vel.");
		p17.setResposta3("Reinstalar a EA Digital.");
		p17.setResposta4("Direcionar ao 3� n�vel.");
		p17.setRespostaCorreta("Reinstalar a EA Digital.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p17);
		
		Pergunta p18 = new Pergunta();
		p18.setAreaAtuacao("Gerais Itau N3");
		p18.setDescricaoPergunta("O sistema I8 apresenta a mensagem de �falha de acesso a log do usu�rio danilbs.log�, qual a primeira coisa a fazer no momento do atendimento?");
		p18.setResposta1("Reinstalar a Interface �nica.");
		p18.setResposta2("Verificar se o usu�rio tem acesso ao I8.");
		p18.setResposta3("Reinstalar o I8.");
		p18.setResposta4("Direcionar o chamado a equipe de sustenta��o do I8.");
		p18.setRespostaCorreta("Verificar se o usu�rio tem acesso ao I8.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p18);
		
		Pergunta p19 = new Pergunta();
		p19.setAreaAtuacao("Gerais Itau N3");
		p19.setDescricaoPergunta("Um usu�rio quer que seu usu�rio Ita� seja adicionado ao grupo administradores em uma m�quina no dominio dm010cto, o que fazer?");
		p19.setResposta1("Orientar ao usu�rio que o mesmo solicite atrav�s do GSI que seu usu�rio seja incluido como administrador na rede.");
		p19.setResposta2("Negar o atendimento.");
		p19.setResposta3("Efetuar a adi��o do usu�rio no grupo de administradores, a fim de evitar escalonamentos e garantir a satisfa��o do usu�rio.");
		p19.setResposta4("N�o adicionar o usu�rio, mas fornecer uma senha de administrador local ao mesmo e registrar p�s log de atendimento.");
		p19.setRespostaCorreta("Orientar ao usu�rio que o mesmo solicite atrav�s do GSI que seu usu�rio seja incluido como administrador na rede.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p19);
		
		Pergunta p20 = new Pergunta();
		p20.setAreaAtuacao("Gerais Itau N3");
		p20.setDescricaoPergunta("O usu�rio quer instalar o SQL Server em uma m�quina Ita�, alegando que � desenvolvedor e que possu�a uma m�quina que tinha o software instalado, como proceder?");
		p20.setResposta1("Instalar o SQL Server e registrar a p�s log no m�ximo descrevendo no chamado o nome da m�quina e que o usu�rio possuia o SQL na m�quina anterior.");
		p20.setResposta2("Negar atendimento e encerrar o chamado (se houver).");
		p20.setResposta3("Orientar ao colaborador que o SQL � proibido, n�o realizar a instala��o e informar ao usu�rio que o mesmo dever� solicitar o �De Acordo� de seu superintendente para que seja efetuada a reinstala��o, e quando ele tiver de posse deste item, efetuar a instala��o.");
		p20.setResposta4("Orientar o colaborador que esta instala��o deve ser solicitada atrav�s do portal de monitora��o de seguran�a (pms.itau), onde o mesmo preencher� um formul�rio de analise de risco e aguardar� a resposta da equipe respons�vel.");
		p20.setRespostaCorreta("Orientar o colaborador que esta instala��o deve ser solicitada atrav�s do portal de monitora��o de seguran�a (pms.itau), onde o mesmo preencher� um formul�rio de analise de risco e aguardar� a resposta da equipe respons�vel.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p20);
		
		
		Pergunta p21 = new Pergunta();
		p21.setAreaAtuacao("TELECOM");
		p21.setDescricaoPergunta("Por padr�o quantos equipamentos coorporativos s�o poss�veis conectar em 01 ponto de rede BBA?");
		p21.setResposta1("1");
		p21.setResposta2("2");
		p21.setResposta3("3");
		p21.setResposta4("4");
		p21.setRespostaCorreta("2");
		new DAO<Pergunta>(Pergunta.class).adiciona(p21);
		
		Pergunta p22 = new Pergunta();
		p22.setAreaAtuacao("TELECOM");
		p22.setDescricaoPergunta("Para trocar TCs ou Desktops � necess�rio ligar para telecom local?");
		p22.setResposta1("N�o, no banco n�o existe port security.");
		p22.setResposta2("N�o, s� ocorre o port security quanto se conecta um notebook na rede do banco.");
		p22.setResposta3("Sim, sempre ligue para o Time Local de Telocom para evitar o bloqueio do ponto de rede");
		p22.setResposta4("Sim, mas pode ser depois da troca do TC ou Desktop.");
		p22.setRespostaCorreta("Sim, sempre ligue para o Time Local de Telocom para evitar o bloqueio do ponto de rede");
		new DAO<Pergunta>(Pergunta.class).adiciona(p22);
		
		Pergunta p23 = new Pergunta();
		p23.setAreaAtuacao("TELECOM");
		p23.setDescricaoPergunta("Quando o usu�rio solicita um ponto de rede adicional o correto �?");
		p23.setResposta1("Informar que ser� providenciado imediatamente.");
		p23.setResposta2("� s� ligar para telecom HP para instalar.");
		p23.setResposta3("Deve-se informar que liguem no HD para que seja feita uma inspe��o do local pelo time telecom.");
		p23.setResposta4("O usu�rio n�o pode ter ponto de rede adicional em nenhuma hipotese");
		p23.setRespostaCorreta("Deve-se informar que liguem no HD para que seja feita uma inspe��o do local pelo time telecom.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p23);
		
		Pergunta p24 = new Pergunta();
		p24.setAreaAtuacao("TELECOM");
		p24.setDescricaoPergunta("Quais cargos t�m permiss�o para possuir Video Phone?");
		p24.setResposta1("Coordenador/Analista");
		p24.setResposta2("Gerente/Diretor");
		p24.setResposta3("Terceiros de TI");
		p24.setResposta4("Todos os funcion�rio do banco.");
		p24.setRespostaCorreta("Gerente/Diretor");
		new DAO<Pergunta>(Pergunta.class).adiciona(p24);
		
		Pergunta p25 = new Pergunta();
		p25.setAreaAtuacao("TELECOM");
		p25.setDescricaoPergunta("Se a m�quina obter possiveis endere�os IP 10.66.X.X ou 10.33.X.X que rede estes ranges pertence?");
		p25.setResposta1("Ita�");
		p25.setResposta2("BBA Inet");
		p25.setResposta3("Ita� BBA");
		p25.setResposta4("Rede CAR");
		p25.setRespostaCorreta("Ita�");
		new DAO<Pergunta>(Pergunta.class).adiciona(p25);
		
		
		Pergunta p26 = new Pergunta();
		p26.setAreaAtuacao("Field - Opera��o");
		p26.setDescricaoPergunta("Com rela��o ao Windows e seus componentes, assinale a incorreta:");
		p26.setResposta1("O Backup permite fazer c�pias de seguran�a de arquivos.");
		p26.setResposta2("O Scandisk permite verificar e corrigir erros em arquivos e pastas.");
		p26.setResposta3("O Drivespace reorganiza os arquivos no HD.");
		p26.setResposta4("O Wordpad � um editor de texto.");
		p26.setRespostaCorreta("O Drivespace reorganiza os arquivos no HD.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p26);
		
		Pergunta p27 = new Pergunta();
		p27.setAreaAtuacao("Field - Opera��o");
		p27.setDescricaoPergunta("Com rela��o ao Microsoft Word para Windows:");
		p27.setResposta1("Um documento com v�rias se��es possui, necessariamente, numera��o de p�gina independente para cada se��o.");
		p27.setResposta2("A fim de facilitar a edi��o, Cabe�alhos e Rodap�s s�o vis�veis tanto no modo de Visualiza��o de Impress�o, quanto no modo de Layout de P�gina.");
		p27.setResposta3("O bot�o Imprimir - da Barra de Ferramentas Padr�o - permite que apenas uma parte do documento ativo seja selecionada para impress�o.");
		p27.setResposta4("Uma defici�ncia do Word � n�o permitir o acesso direto a uma p�gina espec�fica, obrigando o usu�rio a rolar, por meio da Barra de Rolagem, todas as p�ginas precedentes � p�gina desejada, a fim de visualiz�-la na tela.");
		p27.setRespostaCorreta("A fim de facilitar a edi��o, Cabe�alhos e Rodap�s s�o vis�veis tanto no modo de Visualiza��o de Impress�o, quanto no modo de Layout de P�gina.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p27);
		
		Pergunta p28 = new Pergunta();
		p28.setAreaAtuacao("Field - Opera��o");
		p28.setDescricaoPergunta("Com rela��o � utiliza��o de f�rmulas no Microsoft Excel, julgue os itens abaixo:");
		p28.setResposta1("F�rmulas podem ser constitu�das por fun��es usadas sozinhas ou aninhadas dentro de outras fun��es, as quais podem ser inseridas automaticamente pelo Assistente de Fun��o.");
		p28.setResposta2("As f�rmulas '=M�DIA(C22:C26) e =(C22+C23+C24+C25+C26)/5' s�o equivalentes.");
		p28.setResposta3("Nomes de intervalos - grupos de dados semelhantes em uma �rea retangular de uma planilha - podem ser utilizados nas f�rmulas, no lugar das refer�ncias de c�lulas.");
		p28.setResposta4("Todas est�o corretas.");
		p28.setRespostaCorreta("Todas est�o corretas.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p28);
		
		Pergunta p29 = new Pergunta();
		p29.setAreaAtuacao("Field - Opera��o");
		p29.setDescricaoPergunta("A respeito do Microsoft Excel, assinale a incorreta:");
		p29.setResposta1("Para selecionar apenas duas c�lulas n�o-adjacentes, um usu�rio deve selecionar uma c�lula qualquer e, mantendo a tecla Shift pressionada, selecionar a c�lula n�o-adjacente desejada.");
		p29.setResposta2("No Excel, as pastas de trabalho podem conter m�ltiplas planilhas, podendo o usu�rio navegar de uma para a outra utilizando as combina��es das teclas CTRL + Page Down e CTRL + Page Up.");
		p29.setResposta3("A fim de indicar ao Microsoft Excel que uma f�rmula vai iniciar em uma c�lula, qualquer um dos seguintes caracteres deve ser digitado + - = @.");
		p29.setResposta4("O bot�o AutoSoma - da Barra de Ferramentas Padr�o - pode ser usado para localizar e totalizar as linhas ou colunas do intervalo mais pr�ximo � c�lula, para totalizar todo um intervalo selecionado ou para acrescentar totais gerais a um intervalo contendo outros totais.");
		p29.setRespostaCorreta("A fim de indicar ao Microsoft Excel que uma f�rmula vai iniciar em uma c�lula, qualquer um dos seguintes caracteres deve ser digitado + - = @.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p29);
		
		Pergunta p30 = new Pergunta();
		p30.setAreaAtuacao("Field - Opera��o");
		p30.setDescricaoPergunta("Na composi��o da rede, considerando isoladamente uma Intranet, ser� imprescind�vel um:");
		p30.setResposta1("Firewall");
		p30.setResposta2("Roteador");
		p30.setResposta3("Provedor de Servi�os de Internet");
		p30.setResposta4("Servidor Web");
		p30.setRespostaCorreta("Servidor Web");
		new DAO<Pergunta>(Pergunta.class).adiciona(p30);
		
		
		
		Pergunta p31 = new Pergunta();
		p31.setAreaAtuacao("Field - Opera��o");
		p31.setDescricaoPergunta("O que � gateway? ");
		p31.setResposta1("Gateway � quem controla a entrada e sa�da de dados de uma rede, geralmente ele � a liga��o entre a rede interna de uma institui��o e a internet. ");
		p31.setResposta2("Porta somente de sa�da de dados da rede.");
		p31.setResposta3("Porta somente de entrada de dados da rede.");
		p31.setResposta4("Nenhuma das alternativas.");
		p31.setRespostaCorreta("Gateway � quem controla a entrada e sa�da de dados de uma rede, geralmente ele � a liga��o entre a rede interna de uma institui��o e a internet. ");
		new DAO<Pergunta>(Pergunta.class).adiciona(p31);
		
		Pergunta p32 = new Pergunta();
		p32.setAreaAtuacao("Field - Opera��o");
		p32.setDescricaoPergunta("O que � proxy?");
		p32.setResposta1("Site que controla internet.");
		p32.setResposta2("Servidor que controla internet.");
		p32.setResposta3("Controla o acesso a site da internet, ele quem bloqueia ou libera determinados sites.");
		p32.setResposta4("Nenhuma das alternativas.");
		p32.setRespostaCorreta("Controla o acesso a site da internet, ele quem bloqueia ou libera determinados sites.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p32);
		
		Pergunta p33 = new Pergunta();
		p33.setAreaAtuacao("Field - Opera��o");
		p33.setDescricaoPergunta("O que � TCP/IP?");
		p33.setResposta1("O hostname da m�quina.");
		p33.setResposta2("TCP/IP - protocolo de comunica��o numa rede seja ela interna ou na internet. TCP - protocolo de controle de transmiss�o e o IP- protocolo de internet.");
		p33.setResposta3("Resolver o nome do equipamento da rede.");
		p33.setResposta4("A �rea respons�vel pela internet.");
		p33.setRespostaCorreta("TCP/IP - protocolo de comunica��o numa rede seja ela interna ou na internet. TCP - protocolo de controle de transmiss�o e o IP- protocolo de internet.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p33);
		
		Pergunta p34 = new Pergunta();
		p34.setAreaAtuacao("Field - Opera��o");
		p34.setDescricaoPergunta("O que � VPN? ");
		p34.setResposta1("� uma rede privada na internet, ou seja, � como se fosse um t�nel na internet, onde s� que tem a senha pode acessar.");
		p34.setResposta2("VPN � Virtualiza��o por NAT.");
		p34.setResposta3("�rg�o regulamentador da Intranet.");
		p34.setResposta4("� uma rede privada na internet, ou seja, � como se fosse um t�nel na intranet, onde s� que tem a senha pode acessar.");
		p34.setRespostaCorreta("� uma rede privada na internet, ou seja, � como se fosse um t�nel na internet, onde s� que tem a senha pode acessar.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p34);
		
		Pergunta p35 = new Pergunta();
		p35.setAreaAtuacao("Field - Processo");
		p35.setDescricaoPergunta("O que � SLA?");
		p35.setResposta1("Acordo de N�vel de Servi�o.");
		p35.setResposta2("Service Level Agreement.");
		p35.setResposta3("Nenhuma das alternativas.");
		p35.setResposta4("As alternativas A e B.");
		p35.setRespostaCorreta("As alternativas A e B.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p35);
		
		Pergunta p36 = new Pergunta();
		p36.setAreaAtuacao("Field - Processo");
		p36.setDescricaoPergunta("O que � incidente?");
		p36.setResposta1("Qualquer evento que n�o � parte padr�o da opera��o de um servi�o que causa, ou pode causar interrup��o.");
		p36.setResposta2("Dentro do ciclo de vida do servi�o, podemos falar que Incidente � a mesmo que problema.");
		p36.setResposta3("Evento e solu��o de contorno tamb�m podem ser chamados de incidente.");
		p36.setResposta4("Todas as alternativas est�o corretas.");
		p36.setRespostaCorreta("Qualquer evento que n�o � parte padr�o da opera��o de um servi�o que causa, ou pode causar interrup��o.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p36);
		
		Pergunta p37 = new Pergunta();
		p37.setAreaAtuacao("Field - Mobilidade");
		p37.setDescricaoPergunta("Quando algum usu�rio realiza uma viagem ao exterior qual o procedimento seguir?");
		p37.setResposta1("Apenas escolher a rede manualmente que tem parceria com a operadora no Brasil.");
		p37.setResposta2("Nada, a linha funciona corretamente como se estivesse em outro estado.");
		p37.setResposta3("No caso de viagens com o destino Am�rica n�o e necess�rio realizar nenhum tipo de configura��o porem se o destino for em algum pais diferente do continente como Jap�o se torna obrigat�rio contratar o pacote de roaming internacional.");
		p37.setResposta4("Sempre que realizar qualquer tipo de sa�da dos Pais e necess�rio contratar um pacote de dados e voz (roaming) junto a operadora, visto que uma vez ativo a operadora Brasileira possui parceria com operadoras internacionais possibilitando o uso de dados e voz, os pacotes depende de operadora a operadora.");
		p37.setRespostaCorreta("Sempre que realizar qualquer tipo de sa�da dos Pais e necess�rio contratar um pacote de dados e voz (roaming) junto a operadora, visto que uma vez ativo a operadora Brasileira possui parceria com operadoras internacionais possibilitando o uso de dados e voz, os pacotes depende de operadora a operadora.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p37);
		
		Pergunta p38 = new Pergunta();
		p38.setAreaAtuacao("ASSET");
		p38.setDescricaoPergunta("Quais softwares n�o podem ser instalados no IBBA? (Assinalar a alternativa correta)");
		p38.setResposta1("Softwares Corporativos");
		p38.setResposta2("Softwares de Desenvolvimento");
		p38.setResposta3("Softwares Free, sem suporte");
		p38.setResposta4("Softwares de Produ��o");
		p38.setRespostaCorreta("Softwares Free, sem suporte");
		new DAO<Pergunta>(Pergunta.class).adiciona(p38);
		
		Pergunta p39 = new Pergunta();
		p39.setAreaAtuacao("ASSET");
		p39.setDescricaoPergunta("O que significa Software Cinza?");
		p39.setResposta1("Softwares que necessitam de licen�as, seja para baixa em estoque ou requisi��o de compra de uma nova licen�a.");
		p39.setResposta2("Software que n�o pode ser instalado no IBBA.");
		p39.setResposta3("Softwares que n�o necessitam passar pela equipe de ASSET (Gest�o de Licen�as).");
		p39.setResposta4("Softwares comuns a todos os usu�rios (Softwares Corporativos).");
		p39.setRespostaCorreta("Softwares que necessitam de licen�as, seja para baixa em estoque ou requisi��o de compra de uma nova licen�a.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p39);
		
		Pergunta p40 = new Pergunta();
		p40.setAreaAtuacao("Field - Opera��o");
		p40.setDescricaoPergunta("O que � Activity Directory?");
		p40.setResposta1("� a ferramenta utilizada para administra��o de uma rede.");
		p40.setResposta2("� o diret�rio ativado para solucionar problemas do Windows.");
		p40.setResposta3("� a atividade dirigida para colocar uma rede no ar.");
		p40.setResposta4("Todas as alternativas anteriores.");
		p40.setRespostaCorreta("� a ferramenta utilizada para administra��o de uma rede.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p40);
		
		
		Pergunta p41 = new Pergunta();
		p41.setAreaAtuacao("Field - Mobilidade");
		p41.setDescricaoPergunta("Ao sincronizar uma conta de e-mail Outolook Exchange em um aparelho Blackberry, o usu�rio ter� acesso a quais recursos no celular?");
		p41.setResposta1("Somente e-mails.");
		p41.setResposta2("E-mails, Calend�rios e Contatos.");
		p41.setResposta3("E-mails, Calend�rios, contatos, tarefas e Notas.");
		p41.setResposta4("Apenas a lista de contatos.");
		p41.setRespostaCorreta("E-mails, Calend�rios, contatos, tarefas e Notas.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p41);
		
		Pergunta p42 = new Pergunta();
		p42.setAreaAtuacao("Field - Mobilidade");
		p42.setDescricaoPergunta("A ferramenta MDM GOOD � utilizada para sincroniza��o de contas Exchange em aparelhos celulares para uso corporativo. Ela contempla quais modelos/sistemas?");
		p42.setResposta1("Apenas iPhones e iPads.");
		p42.setResposta2("Ios, Android, Windows Phone.");
		p42.setResposta3("Android, iPhones, Blackberry.");
		p42.setResposta4("Blackberry, Android, Ios e Windwos Phone.");
		p42.setRespostaCorreta("Apenas iPhones e iPads.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p42);
		
		
		Pergunta p43 = new Pergunta();
		p43.setAreaAtuacao("Field - Performance");
		p43.setDescricaoPergunta("Qual aba no vcenter devemos acessar para verificar o consumo de CPU e/ou memoria");
		p43.setResposta1("Aba tasks & events / cpu e/ou memoria");
		p43.setResposta2("Aba Ressource Allocation / cpu e/ou memoria");
		p43.setResposta3("Aba Console / cpu e/ou memoria");
		p43.setResposta4("Aba performance / advanced / cpu e/ou memoria");
		p43.setRespostaCorreta("Aba performance / advanced / cpu e/ou memoria");
		new DAO<Pergunta>(Pergunta.class).adiciona(p43);
		
		Pergunta p44 = new Pergunta();
		p44.setAreaAtuacao("Field - Performance");
		p44.setDescricaoPergunta("Quais itens devemos analisar para identificar um problema de performance ?");
		p44.setResposta1("Verificar event viewer, gerenciador de tarefas  e reiniciar a maquina.");
		p44.setResposta2("Executar bat de otimiza��o e verificar thin client");
		p44.setResposta3("Verificar servi�os em execu��o, analisar espa�o em disco.");
		p44.setResposta4("Todas as alternativas est�o corretas.");
		p44.setRespostaCorreta("Todas as alternativas est�o corretas.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p44);
		
		Pergunta p45 = new Pergunta();
		p45.setAreaAtuacao("Field - Performance");
		p45.setDescricaoPergunta("Quando for identificado no gerenciador de tarefas um processo com alto consumo de CPU como devemos proceder para solu��o do problema ?");
		p45.setResposta1("Devemos reiniciar a maquina e caso persista solicitar a troca da maquina.");
		p45.setResposta2("Encaminhar para vdi e solicitar aumento de cpu e/ou memoria.");
		p45.setResposta3("Reparar o processo ou reinstalar a aplica��o que est� sendo utilizado pelo processo.");
		p45.setResposta4("Devemos desinstalar a aplica��o que esta gerando alto consumo de recurso.");
		p45.setRespostaCorreta("Reparar o processo ou reinstalar a aplica��o que est� sendo utilizado pelo processo.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p45);
		
		Pergunta p46 = new Pergunta();
		p46.setAreaAtuacao("Field - Performance");
		p46.setDescricaoPergunta("Quando uma m�quina virtual apresentar problema de performance, acrescentando Cpu e Mem�ria de fato resolvera o problema?");
		p46.setResposta1("Sim, sempre resolve o problema.");
		p46.setResposta2("N�o, nunca resolve o problema.");
		p46.setResposta3("Sim, somente se o usu�rio usa softwares que consomem grande quantidade de recursos computacionais (CPU e mem�ria). Ex: Planilhas excel com macros.");
		p46.setResposta4("N�o, o usu�rio deve solicitar uma maquina fisica para resolver o problema.");
		p46.setRespostaCorreta("Sim, somente se o usu�rio usa softwares que consomem grande quanbtidade de recursos computacionais (CPU e mem�ria). Ex: Planilhas excel com macros.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p46);
		
		Pergunta p47 = new Pergunta();
		p47.setAreaAtuacao("Field - Performance");
		p47.setDescricaoPergunta("Uma m�quina virtual com 4 CPUs � mais r�pida que uma m�quina com 2 CPUs?");
		p47.setResposta1("Sim, sempre ser� mais rapida uma MV com 4 CPUs do que uma MV com 2 CPUs");
		p47.setResposta2("N�o, o que influ�ncia a velocidade � o clock do servidor fisico.");
		p47.setResposta3("N�o, a quantidade de CPU n�o interfere no desempenho da MV.");
		p47.setResposta4("Sim, desde que n�o haja muitas MVs no host e o mesmo tenha CPU disponivel.");
		p47.setRespostaCorreta("Sim, desde que n�o haja muitas MVs no host e o mesmo tenha CPU disponivel.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p47);
		*/
		
		Pergunta p48 = new Pergunta();
		p48.setAreaAtuacao("Grava��o de Midias e Downloads");
		p48.setDescricaoPergunta("Usu�rio n�o possui acesso a determinado site para efetuar download de um arquivos em formato pdf, qual orienta��o devemos passar para o usu�rio?");
		p48.setResposta1("Enviar solicita��o de acesso ao site para o download ao Security Office.");
		p48.setResposta2("Informar ao usu�rio que o download n�o poder� ser efetuado, pois � proibido fazer qualquer tipo de download dentro da rede do banco.");
		p48.setResposta3("Abrir chamado no Helpdesk para verificar as configura��es do navegador.");
		p48.setResposta4("Solicitar a aprova��o do gestor e encaminhar para o Helpdesk para que possa ser aberto um chamado para a area de grava��o de midias.");
		p48.setRespostaCorreta("Solicitar a aprova��o do gestor e encaminhar para o Helpdesk para que possa ser aberto um chamado para a area de grava��o de midias.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p48);
		
		Pergunta p49 = new Pergunta();
		p49.setAreaAtuacao("Grava��o de Midias e Downloads");
		p49.setDescricaoPergunta("Usu�rio informa que n�o consegue localizar um arquivo em seu desktop, o mesmo solicita o restore deste arquivo, o que devemos fazer?");
		p49.setResposta1("Enviar pedido de restore para o setor suporte servidores.");
		p49.setResposta2("Enviar pedido de restore para  o setor suporte backup.");
		p49.setResposta3("Enviar pedido de restore para o setor  download de m�dias e download.");
		p49.setResposta4("Enviar pedido de restore para o setor  Opera��o VDI.");
		p49.setRespostaCorreta("Enviar pedido de restore para  o setor suporte backup.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p49);
		
		Pergunta p50 = new Pergunta();
		p50.setAreaAtuacao("Grava��o de Midias e Downloads");
		p50.setDescricaoPergunta("Para o pedido de c�pia de arquivo ( tamb�m pode ser considerado download ) � necess�rio uma aprova��o para o mesmo. Qual ordem de quem o usu�rio deve solicitar a aprova��o?");
		p50.setResposta1("Diretor, coordenador,  gestor.");
		p50.setResposta2("Superintendente, Diretor, gerente.");
		p50.setResposta3("Gestor, gerente, superintendente.");
		p50.setResposta4("Gerente, superintendente, Diretor.");
		p50.setRespostaCorreta("Gerente, superintendente, Diretor.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p50);
		
		
	}

}
