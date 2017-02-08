package br.com.skillsmap.tests;

import br.com.skillmap.dao.DAO;
import br.com.skillmap.entity.Pergunta;



public class TestEntity {

	public static void main(String[] args) {
		
		/*
		Pergunta p1 = new Pergunta();
		p1.setAreaAtuacao("Enterprise Vault");
		p1.setDescricaoPergunta("Quais são os primeiros processos que devem ser executados quando o Add-in do Enterprise Vault não aparece no Outlook?");
		p1.setResposta1("Reinstalar o Enterprise Vault, Reiniciar a MV e habilitar o suplemento.");
		p1.setResposta2("Verificar se o acesso foi concedido a mais de 24 horas, executar a bat ResetEVClient e habilitar o Add-in do Outlook.");
		p1.setResposta3("Executar a bat ResetEVClient, habilitar o add-in no outlook e reiniciar a mv.");
		p1.setResposta4("Verificar se o usuário possui acesso, reiniciar a MV e reinstalar o Enterprise Vault.");
		p1.setRespostaCorreta("Verificar se o acesso foi concedido a mais de 24horas, executar a bat ResetEVClient e habilitar o Add-in do Outlook.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p1);
		
		
		Pergunta p2 = new Pergunta();
		p2.setAreaAtuacao("Enterprise Vault");
		p2.setDescricaoPergunta("Todos os usuários com acesso ao Enteprise Vault estão incluídos em uma política de armazenamento. Qual é a politica padrão para os usuários ? A política pode ser alterada?");
		p2.setResposta1("Política de armazenamento de e-mails recebidos à 15 dias e não pode ser alterada.");
		p2.setResposta2("Política de armazenamento de e-mails recebidos à 30 dias e não pode ser alterada.");
		p2.setResposta3("Política de armazenamento de e-mails recebidos à 30 dias e pode ser alterada.");
		p2.setResposta4("Política de armazenamento de e-mails recebidos à 20 dias e pode ser alterada.");
		p2.setRespostaCorreta("Política de armazenamento de e-mails recebidos à 30 dias e pode ser alterada.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p2);
		
		Pergunta p3 = new Pergunta();
		p3.setAreaAtuacao("Enterprise Vault");
		p3.setDescricaoPergunta("Um usuário está cadastrado na política de armazenamento padrão do Enterprise Vault, porém a capacidade da sua mailbox passa do limite de 500MB várias vezes durante a semana devido a grande quantidade de e-mails que ele recebe. Sendo assim, abre diversos chamados com problemas de envio e recebimento no Outlook. Qual orientação deve ser dada ao usuário?");
		p3.setResposta1("Orientar o usuário à abrir um chamado para aumentar a cota de 500MB do Outlook.");
		p3.setResposta2("Orientar o usuário à abrir um chamado para aumento de espaço em disco.");
		p3.setResposta3("Orientar o usuário à abrir um chamado para trocar a politica de armazenamento do EV para um tempo menor do que a padrão.");
		p3.setResposta4("Orientar o usuário à armazenar manualmente os e-mails no Enterprise Vault todos os dias.");
		p3.setRespostaCorreta("Orientar o usuário à abrir um chamado para trocar a politica de armazenamento do EV para um tempo menor do que a padrão.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p3);

		Pergunta p4 = new Pergunta();
		p4.setAreaAtuacao("Enterprise Vault");
		p4.setDescricaoPergunta("Usuários que possuem em sua MV o sistema operacional XP muitas das vezes não conseguem acessar o add-in do Enterprise Vault no Outlook. Após clicarem no ícone do EV, ele direciona para a página com uma mensagem de erro com fundo preto na parte superior da tela do Outlook. Esta mensagem informa que há incompatibilidades ...... Qual é o diagnóstico para o problema?");
		p4.setResposta1("Usuário possui a versão do Internet Explorer 7 instalado na MV e a solução é instalar uma versão superior (Internet Explorer 8).");
		p4.setResposta2("O Enterprise Vault não funciona no Outlook de quem possui MV com S.O XP.");
		p4.setResposta3("Usuário não tem o Mozilla Firefox e Chrome instalado em sua MV e a solução é instalar os dois navegadores.");
		p4.setResposta4("O problema está no Office utilizado pelo usuário e a solução é reparar o software.");
		p4.setRespostaCorreta("Usuário possui a versão do Internet Explorer 7 instalado na MV e a solução é instalar uma versão superior (Internet Explorer 8).");
		new DAO<Pergunta>(Pergunta.class).adiciona(p4);
		
		Pergunta p5 = new Pergunta();
		p5.setAreaAtuacao("Enterprise Vault");
		p5.setDescricaoPergunta("Os e-mails arquivados no Enterprise Vault estarão disponíveis para consulta durante um determinado tempo. Durante quanto tempo os e-mails armazenados ficam disponíveis no EV?");
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
		p7.setDescricaoPergunta("Qual é a responsabilidade da Operação VDI?");
		p7.setResposta1("Resolver qualquer tipo de problema das maquinas virtuais (inclusive problemas de software e sistema operacional).");
		p7.setResposta2("Criar, excluir e gerenciar as maquinas virtuais na camada da infraestrutura.");
		p7.setResposta3("Apenas criar maquinas virtuais.");
		p7.setResposta4("Atuar como suporte terceiro nível, auxiliando o time na resolução de problemas referente a maquinas virtuais.");
		p7.setRespostaCorreta("Criar, excluir e gerenciar as maquinas virtuais na camada da infraestrutura.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p7);
		
		Pergunta p8 = new Pergunta();
		p8.setAreaAtuacao("VDI");
		p8.setDescricaoPergunta("Quem faz o backup/restore das máquinas virtuais?");
		p8.setResposta1("Time da Operação VDI.");
		p8.setResposta2("Time de Suporte Servidores.");
		p8.setResposta3("Time de Produção.");
		p8.setResposta4("Time de Backup.");
		p8.setRespostaCorreta("Time de Backup.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p8);
		
		Pergunta p9 = new Pergunta();
		p9.setAreaAtuacao("VDI");
		p9.setDescricaoPergunta("Quando há indisponibilidade em um servidor vCenter o que acontece com as maquinas virtuais?");
		p9.setResposta1("As maquinas virtuais ficam indisponíveis, impossibilitando o uso das mesmas deixando os usuários indisponíveis.");
		p9.setResposta2("As maquinas virtuais continuam funcionando normalmente, porém não é possível gerencia-las pelo vSphere.");
		p9.setResposta3("As maquinas ficam indisponíveis porem uma contingencia é liberada para o os usuários não fiquem indisponíveis.");
		p9.setResposta4("Nenhuma das anteriores, servidor vCenter nunca fica indisponível.");
		p9.setRespostaCorreta("As maquinas virtuais continuam funcionando normalmente, porém não é possível gerencia-las pelo vSphere.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p9);
		
		
		Pergunta p10 = new Pergunta();
		p10.setAreaAtuacao("VDI");
		p10.setDescricaoPergunta("Em que situação não recomendável o uso de MV?");
		p10.setResposta1("Quando o usuário utiliza macros que consome grande quantidade de processamento e memória RAM.");
		p10.setResposta2("Quando o usuário salva muitos arquivos em disco (PST, banco de dados em access).");
		p10.setResposta3("Quando o usuário usa sistemas que necessitam de muito recurso de vídeo.");
		p10.setResposta4("Nenhuma das anteriores.");
		p10.setRespostaCorreta("Quando o usuário usa sistemas que necessitam de muito recurso de vídeo.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p10);		
		
		Pergunta p11 = new Pergunta();
		p11.setAreaAtuacao("Gerais Itau N3");
		p11.setDescricaoPergunta("Qual o procedimento para que o usuário saiba quem é seu solicitante de acessos Itaú? ");
		p11.setResposta1("Perguntando ao colega do colaborador.");
		p11.setResposta2("Através do Portal Corporativo do Itaú.");
		p11.setResposta3("Ligando no Help Desk Itau (8668).");
		p11.setResposta4("Através do Portal GSI");
		p11.setRespostaCorreta("Através do Portal GSI");
		new DAO<Pergunta>(Pergunta.class).adiciona(p11);
		
		Pergunta p12 = new Pergunta();
		p12.setAreaAtuacao("Gerais Itau N3");
		p12.setDescricaoPergunta("Uma máquina Itaú de um Trader está entrando em estado de hibernação a cada 30 minutos sem interação e recebendo atualizações durante o expediente, qual a causa do problema?");
		p12.setResposta1("Modo de economia de energia ativado.");
		p12.setResposta2("Windows Update Ativo.");
		p12.setResposta3("Máquina recebendo patches pelo SCCM.");
		p12.setResposta4("Nome da máquina com o padrão incorreto (Ex: CP-FULANO).");
		p12.setRespostaCorreta("Nome da máquina com o padrão incorreto (Ex: CP-FULANO).");
		new DAO<Pergunta>(Pergunta.class).adiciona(p12);
		
		Pergunta p13 = new Pergunta();
		p13.setAreaAtuacao("Gerais Itau N3");
		p13.setDescricaoPergunta("Um colaborador com notebook no dominio dm010cto deseja ter acesso a rede Wireless do Itaú, qual o requisito minimo (alem de uma placa wireless e de um usuário de rede válido no dominio dm010cto) necessário para que o mesmo tenha acesso a rede wireless corporativa?");
		p13.setResposta1("Acesso ao ambiente de produção.");
		p13.setResposta2("Acesso à internet.");
		p13.setResposta3("Email com o sufixo Itaú cadastrado no AD.");
		p13.setResposta4("Acesso administrador no notebook.");
		p13.setRespostaCorreta("Email com o sufixo Itaú cadastrado no AD.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p13);
		
		Pergunta p14 = new Pergunta();
		p14.setAreaAtuacao("Gerais Itau N3");
		p14.setDescricaoPergunta("Qual a maneira mais segura de reinstalar a Bloomberg em uma máquina após o expediente?");
		p14.setResposta1("Perguntar ao usuário se o mesmo utiliza B-Unit ou Senha para acessar a Bloomberg e após isso reinstalar.");
		p14.setResposta2("Removendo o software e reinstalando pelo painel de controle.");
		p14.setResposta3("Removendo com Revo.");
		p14.setResposta4("Removendo com o perfil do usuário.");
		p14.setRespostaCorreta("Perguntar ao usuário se o mesmo utiliza B-Unit ou Senha para acessar a Bloomberg e após isso reinstalar.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p14);
		
		Pergunta p15 = new Pergunta();
		p15.setAreaAtuacao("Gerais Itau N3");
		p15.setDescricaoPergunta("O Excel do colaborador trava com a mensagem de “Não Respondendo” quando o colaborador abre uma planilha em branco, o que fazer no momento do atendimento?");
		p15.setResposta1("Executar o Excel como administrador.");
		p15.setResposta2("Reinstalar os addins da planilha do usuário, reinstalar o Office e certificar-se de que o Service Pack esta atualizado conforme a versão do Office.");
		p15.setResposta3("Atualizar o Office para a versão mais recente.");
		p15.setResposta4("Chamar Imediatamente o 3º nível, pois o mesmo dispõe de um especialista de Excel disponivel e qualificado para solucionar o problema.");
		p15.setRespostaCorreta("Executar o Excel como administrador.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p15);
		
		Pergunta p16 = new Pergunta();
		p16.setAreaAtuacao("Gerais Itau N3");
		p16.setDescricaoPergunta("Uma workstation HP (Modelos Z420 ou Z220) apresenta falta de recursos de memória, o que fazer considerando que a mesma possui 12 gb de memória já instalada?");
		p16.setResposta1("Adicionar mais 8 GB de memória na máquina.");
		p16.setResposta2("Efetuar a limpeza de disco.");
		p16.setResposta3("Utilizar o comando gpupdate a fim de atualizar as diretivas de rede e limpar as requisições da máquina do usuário.");
		p16.setResposta4("Analisar qual aplicação esta consumindo memória da máquina, remover o possível ofensor, reiniciar a máquina, e reinstalar.");
		p16.setRespostaCorreta("Analisar qual aplicação esta consumindo memória da máquina, remover o possível ofensor, reiniciar a máquina, e reinstalar.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p16);
		
		Pergunta p17 = new Pergunta();
		p17.setAreaAtuacao("Gerais Itau N3");
		p17.setDescricaoPergunta("A EA digital apresenta falha ao executar uma função especifica, são exibidos erros de página expirada, a EA trava, etc.Qual a primeira ação a ser tomada?");
		p17.setResposta1("Reinstalar a EAWEB.");
		p17.setResposta2("Trocar a máquina para Windows XP pois a função pode não ser compatível.");
		p17.setResposta3("Reinstalar a EA Digital.");
		p17.setResposta4("Direcionar ao 3º nível.");
		p17.setRespostaCorreta("Reinstalar a EA Digital.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p17);
		
		Pergunta p18 = new Pergunta();
		p18.setAreaAtuacao("Gerais Itau N3");
		p18.setDescricaoPergunta("O sistema I8 apresenta a mensagem de “falha de acesso a log do usuário danilbs.log”, qual a primeira coisa a fazer no momento do atendimento?");
		p18.setResposta1("Reinstalar a Interface Única.");
		p18.setResposta2("Verificar se o usuário tem acesso ao I8.");
		p18.setResposta3("Reinstalar o I8.");
		p18.setResposta4("Direcionar o chamado a equipe de sustentação do I8.");
		p18.setRespostaCorreta("Verificar se o usuário tem acesso ao I8.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p18);
		
		Pergunta p19 = new Pergunta();
		p19.setAreaAtuacao("Gerais Itau N3");
		p19.setDescricaoPergunta("Um usuário quer que seu usuário Itaú seja adicionado ao grupo administradores em uma máquina no dominio dm010cto, o que fazer?");
		p19.setResposta1("Orientar ao usuário que o mesmo solicite através do GSI que seu usuário seja incluido como administrador na rede.");
		p19.setResposta2("Negar o atendimento.");
		p19.setResposta3("Efetuar a adição do usuário no grupo de administradores, a fim de evitar escalonamentos e garantir a satisfação do usuário.");
		p19.setResposta4("Não adicionar o usuário, mas fornecer uma senha de administrador local ao mesmo e registrar pós log de atendimento.");
		p19.setRespostaCorreta("Orientar ao usuário que o mesmo solicite através do GSI que seu usuário seja incluido como administrador na rede.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p19);
		
		Pergunta p20 = new Pergunta();
		p20.setAreaAtuacao("Gerais Itau N3");
		p20.setDescricaoPergunta("O usuário quer instalar o SQL Server em uma máquina Itaú, alegando que é desenvolvedor e que possuía uma máquina que tinha o software instalado, como proceder?");
		p20.setResposta1("Instalar o SQL Server e registrar a pós log no máximo descrevendo no chamado o nome da máquina e que o usuário possuia o SQL na máquina anterior.");
		p20.setResposta2("Negar atendimento e encerrar o chamado (se houver).");
		p20.setResposta3("Orientar ao colaborador que o SQL é proibido, não realizar a instalação e informar ao usuário que o mesmo deverá solicitar o “De Acordo” de seu superintendente para que seja efetuada a reinstalação, e quando ele tiver de posse deste item, efetuar a instalação.");
		p20.setResposta4("Orientar o colaborador que esta instalação deve ser solicitada através do portal de monitoração de segurança (pms.itau), onde o mesmo preencherá um formulário de analise de risco e aguardará a resposta da equipe responsável.");
		p20.setRespostaCorreta("Orientar o colaborador que esta instalação deve ser solicitada através do portal de monitoração de segurança (pms.itau), onde o mesmo preencherá um formulário de analise de risco e aguardará a resposta da equipe responsável.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p20);
		
		
		Pergunta p21 = new Pergunta();
		p21.setAreaAtuacao("TELECOM");
		p21.setDescricaoPergunta("Por padrão quantos equipamentos coorporativos são possíveis conectar em 01 ponto de rede BBA?");
		p21.setResposta1("1");
		p21.setResposta2("2");
		p21.setResposta3("3");
		p21.setResposta4("4");
		p21.setRespostaCorreta("2");
		new DAO<Pergunta>(Pergunta.class).adiciona(p21);
		
		Pergunta p22 = new Pergunta();
		p22.setAreaAtuacao("TELECOM");
		p22.setDescricaoPergunta("Para trocar TCs ou Desktops é necessário ligar para telecom local?");
		p22.setResposta1("Não, no banco não existe port security.");
		p22.setResposta2("Não, só ocorre o port security quanto se conecta um notebook na rede do banco.");
		p22.setResposta3("Sim, sempre ligue para o Time Local de Telocom para evitar o bloqueio do ponto de rede");
		p22.setResposta4("Sim, mas pode ser depois da troca do TC ou Desktop.");
		p22.setRespostaCorreta("Sim, sempre ligue para o Time Local de Telocom para evitar o bloqueio do ponto de rede");
		new DAO<Pergunta>(Pergunta.class).adiciona(p22);
		
		Pergunta p23 = new Pergunta();
		p23.setAreaAtuacao("TELECOM");
		p23.setDescricaoPergunta("Quando o usuário solicita um ponto de rede adicional o correto é?");
		p23.setResposta1("Informar que será providenciado imediatamente.");
		p23.setResposta2("É só ligar para telecom HP para instalar.");
		p23.setResposta3("Deve-se informar que liguem no HD para que seja feita uma inspeção do local pelo time telecom.");
		p23.setResposta4("O usuário não pode ter ponto de rede adicional em nenhuma hipotese");
		p23.setRespostaCorreta("Deve-se informar que liguem no HD para que seja feita uma inspeção do local pelo time telecom.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p23);
		
		Pergunta p24 = new Pergunta();
		p24.setAreaAtuacao("TELECOM");
		p24.setDescricaoPergunta("Quais cargos têm permissão para possuir Video Phone?");
		p24.setResposta1("Coordenador/Analista");
		p24.setResposta2("Gerente/Diretor");
		p24.setResposta3("Terceiros de TI");
		p24.setResposta4("Todos os funcionário do banco.");
		p24.setRespostaCorreta("Gerente/Diretor");
		new DAO<Pergunta>(Pergunta.class).adiciona(p24);
		
		Pergunta p25 = new Pergunta();
		p25.setAreaAtuacao("TELECOM");
		p25.setDescricaoPergunta("Se a máquina obter possiveis endereços IP 10.66.X.X ou 10.33.X.X que rede estes ranges pertence?");
		p25.setResposta1("Itaú");
		p25.setResposta2("BBA Inet");
		p25.setResposta3("Itaú BBA");
		p25.setResposta4("Rede CAR");
		p25.setRespostaCorreta("Itaú");
		new DAO<Pergunta>(Pergunta.class).adiciona(p25);
		
		
		Pergunta p26 = new Pergunta();
		p26.setAreaAtuacao("Field - Operação");
		p26.setDescricaoPergunta("Com relação ao Windows e seus componentes, assinale a incorreta:");
		p26.setResposta1("O Backup permite fazer cópias de segurança de arquivos.");
		p26.setResposta2("O Scandisk permite verificar e corrigir erros em arquivos e pastas.");
		p26.setResposta3("O Drivespace reorganiza os arquivos no HD.");
		p26.setResposta4("O Wordpad é um editor de texto.");
		p26.setRespostaCorreta("O Drivespace reorganiza os arquivos no HD.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p26);
		
		Pergunta p27 = new Pergunta();
		p27.setAreaAtuacao("Field - Operação");
		p27.setDescricaoPergunta("Com relação ao Microsoft Word para Windows:");
		p27.setResposta1("Um documento com várias seções possui, necessariamente, numeração de página independente para cada seção.");
		p27.setResposta2("A fim de facilitar a edição, Cabeçalhos e Rodapés são visíveis tanto no modo de Visualização de Impressão, quanto no modo de Layout de Página.");
		p27.setResposta3("O botão Imprimir - da Barra de Ferramentas Padrão - permite que apenas uma parte do documento ativo seja selecionada para impressão.");
		p27.setResposta4("Uma deficiência do Word é não permitir o acesso direto a uma página específica, obrigando o usuário a rolar, por meio da Barra de Rolagem, todas as páginas precedentes à página desejada, a fim de visualizá-la na tela.");
		p27.setRespostaCorreta("A fim de facilitar a edição, Cabeçalhos e Rodapés são visíveis tanto no modo de Visualização de Impressão, quanto no modo de Layout de Página.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p27);
		
		Pergunta p28 = new Pergunta();
		p28.setAreaAtuacao("Field - Operação");
		p28.setDescricaoPergunta("Com relação à utilização de fórmulas no Microsoft Excel, julgue os itens abaixo:");
		p28.setResposta1("Fórmulas podem ser constituídas por funções usadas sozinhas ou aninhadas dentro de outras funções, as quais podem ser inseridas automaticamente pelo Assistente de Função.");
		p28.setResposta2("As fórmulas '=MÉDIA(C22:C26) e =(C22+C23+C24+C25+C26)/5' são equivalentes.");
		p28.setResposta3("Nomes de intervalos - grupos de dados semelhantes em uma área retangular de uma planilha - podem ser utilizados nas fórmulas, no lugar das referências de células.");
		p28.setResposta4("Todas estão corretas.");
		p28.setRespostaCorreta("Todas estão corretas.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p28);
		
		Pergunta p29 = new Pergunta();
		p29.setAreaAtuacao("Field - Operação");
		p29.setDescricaoPergunta("A respeito do Microsoft Excel, assinale a incorreta:");
		p29.setResposta1("Para selecionar apenas duas células não-adjacentes, um usuário deve selecionar uma célula qualquer e, mantendo a tecla Shift pressionada, selecionar a célula não-adjacente desejada.");
		p29.setResposta2("No Excel, as pastas de trabalho podem conter múltiplas planilhas, podendo o usuário navegar de uma para a outra utilizando as combinações das teclas CTRL + Page Down e CTRL + Page Up.");
		p29.setResposta3("A fim de indicar ao Microsoft Excel que uma fórmula vai iniciar em uma célula, qualquer um dos seguintes caracteres deve ser digitado + - = @.");
		p29.setResposta4("O botão AutoSoma - da Barra de Ferramentas Padrão - pode ser usado para localizar e totalizar as linhas ou colunas do intervalo mais próximo à célula, para totalizar todo um intervalo selecionado ou para acrescentar totais gerais a um intervalo contendo outros totais.");
		p29.setRespostaCorreta("A fim de indicar ao Microsoft Excel que uma fórmula vai iniciar em uma célula, qualquer um dos seguintes caracteres deve ser digitado + - = @.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p29);
		
		Pergunta p30 = new Pergunta();
		p30.setAreaAtuacao("Field - Operação");
		p30.setDescricaoPergunta("Na composição da rede, considerando isoladamente uma Intranet, será imprescindível um:");
		p30.setResposta1("Firewall");
		p30.setResposta2("Roteador");
		p30.setResposta3("Provedor de Serviços de Internet");
		p30.setResposta4("Servidor Web");
		p30.setRespostaCorreta("Servidor Web");
		new DAO<Pergunta>(Pergunta.class).adiciona(p30);
		
		
		
		Pergunta p31 = new Pergunta();
		p31.setAreaAtuacao("Field - Operação");
		p31.setDescricaoPergunta("O que é gateway? ");
		p31.setResposta1("Gateway é quem controla a entrada e saída de dados de uma rede, geralmente ele é a ligação entre a rede interna de uma instituição e a internet. ");
		p31.setResposta2("Porta somente de saída de dados da rede.");
		p31.setResposta3("Porta somente de entrada de dados da rede.");
		p31.setResposta4("Nenhuma das alternativas.");
		p31.setRespostaCorreta("Gateway é quem controla a entrada e saída de dados de uma rede, geralmente ele é a ligação entre a rede interna de uma instituição e a internet. ");
		new DAO<Pergunta>(Pergunta.class).adiciona(p31);
		
		Pergunta p32 = new Pergunta();
		p32.setAreaAtuacao("Field - Operação");
		p32.setDescricaoPergunta("O que é proxy?");
		p32.setResposta1("Site que controla internet.");
		p32.setResposta2("Servidor que controla internet.");
		p32.setResposta3("Controla o acesso a site da internet, ele quem bloqueia ou libera determinados sites.");
		p32.setResposta4("Nenhuma das alternativas.");
		p32.setRespostaCorreta("Controla o acesso a site da internet, ele quem bloqueia ou libera determinados sites.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p32);
		
		Pergunta p33 = new Pergunta();
		p33.setAreaAtuacao("Field - Operação");
		p33.setDescricaoPergunta("O que é TCP/IP?");
		p33.setResposta1("O hostname da máquina.");
		p33.setResposta2("TCP/IP - protocolo de comunicação numa rede seja ela interna ou na internet. TCP - protocolo de controle de transmissão e o IP- protocolo de internet.");
		p33.setResposta3("Resolver o nome do equipamento da rede.");
		p33.setResposta4("A área responsável pela internet.");
		p33.setRespostaCorreta("TCP/IP - protocolo de comunicação numa rede seja ela interna ou na internet. TCP - protocolo de controle de transmissão e o IP- protocolo de internet.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p33);
		
		Pergunta p34 = new Pergunta();
		p34.setAreaAtuacao("Field - Operação");
		p34.setDescricaoPergunta("O que é VPN? ");
		p34.setResposta1("É uma rede privada na internet, ou seja, é como se fosse um túnel na internet, onde só que tem a senha pode acessar.");
		p34.setResposta2("VPN – Virtualização por NAT.");
		p34.setResposta3("Órgão regulamentador da Intranet.");
		p34.setResposta4("É uma rede privada na internet, ou seja, é como se fosse um túnel na intranet, onde só que tem a senha pode acessar.");
		p34.setRespostaCorreta("É uma rede privada na internet, ou seja, é como se fosse um túnel na internet, onde só que tem a senha pode acessar.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p34);
		
		Pergunta p35 = new Pergunta();
		p35.setAreaAtuacao("Field - Processo");
		p35.setDescricaoPergunta("O que é SLA?");
		p35.setResposta1("Acordo de Nível de Serviço.");
		p35.setResposta2("Service Level Agreement.");
		p35.setResposta3("Nenhuma das alternativas.");
		p35.setResposta4("As alternativas A e B.");
		p35.setRespostaCorreta("As alternativas A e B.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p35);
		
		Pergunta p36 = new Pergunta();
		p36.setAreaAtuacao("Field - Processo");
		p36.setDescricaoPergunta("O que é incidente?");
		p36.setResposta1("Qualquer evento que não é parte padrão da operação de um serviço que causa, ou pode causar interrupção.");
		p36.setResposta2("Dentro do ciclo de vida do serviço, podemos falar que Incidente é a mesmo que problema.");
		p36.setResposta3("Evento e solução de contorno também podem ser chamados de incidente.");
		p36.setResposta4("Todas as alternativas estão corretas.");
		p36.setRespostaCorreta("Qualquer evento que não é parte padrão da operação de um serviço que causa, ou pode causar interrupção.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p36);
		
		Pergunta p37 = new Pergunta();
		p37.setAreaAtuacao("Field - Mobilidade");
		p37.setDescricaoPergunta("Quando algum usuário realiza uma viagem ao exterior qual o procedimento seguir?");
		p37.setResposta1("Apenas escolher a rede manualmente que tem parceria com a operadora no Brasil.");
		p37.setResposta2("Nada, a linha funciona corretamente como se estivesse em outro estado.");
		p37.setResposta3("No caso de viagens com o destino América não e necessário realizar nenhum tipo de configuração porem se o destino for em algum pais diferente do continente como Japão se torna obrigatório contratar o pacote de roaming internacional.");
		p37.setResposta4("Sempre que realizar qualquer tipo de saída dos Pais e necessário contratar um pacote de dados e voz (roaming) junto a operadora, visto que uma vez ativo a operadora Brasileira possui parceria com operadoras internacionais possibilitando o uso de dados e voz, os pacotes depende de operadora a operadora.");
		p37.setRespostaCorreta("Sempre que realizar qualquer tipo de saída dos Pais e necessário contratar um pacote de dados e voz (roaming) junto a operadora, visto que uma vez ativo a operadora Brasileira possui parceria com operadoras internacionais possibilitando o uso de dados e voz, os pacotes depende de operadora a operadora.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p37);
		
		Pergunta p38 = new Pergunta();
		p38.setAreaAtuacao("ASSET");
		p38.setDescricaoPergunta("Quais softwares não podem ser instalados no IBBA? (Assinalar a alternativa correta)");
		p38.setResposta1("Softwares Corporativos");
		p38.setResposta2("Softwares de Desenvolvimento");
		p38.setResposta3("Softwares Free, sem suporte");
		p38.setResposta4("Softwares de Produção");
		p38.setRespostaCorreta("Softwares Free, sem suporte");
		new DAO<Pergunta>(Pergunta.class).adiciona(p38);
		
		Pergunta p39 = new Pergunta();
		p39.setAreaAtuacao("ASSET");
		p39.setDescricaoPergunta("O que significa Software Cinza?");
		p39.setResposta1("Softwares que necessitam de licenças, seja para baixa em estoque ou requisição de compra de uma nova licença.");
		p39.setResposta2("Software que não pode ser instalado no IBBA.");
		p39.setResposta3("Softwares que não necessitam passar pela equipe de ASSET (Gestão de Licenças).");
		p39.setResposta4("Softwares comuns a todos os usuários (Softwares Corporativos).");
		p39.setRespostaCorreta("Softwares que necessitam de licenças, seja para baixa em estoque ou requisição de compra de uma nova licença.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p39);
		
		Pergunta p40 = new Pergunta();
		p40.setAreaAtuacao("Field - Operação");
		p40.setDescricaoPergunta("O que é Activity Directory?");
		p40.setResposta1("É a ferramenta utilizada para administração de uma rede.");
		p40.setResposta2("É o diretório ativado para solucionar problemas do Windows.");
		p40.setResposta3("É a atividade dirigida para colocar uma rede no ar.");
		p40.setResposta4("Todas as alternativas anteriores.");
		p40.setRespostaCorreta("É a ferramenta utilizada para administração de uma rede.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p40);
		
		
		Pergunta p41 = new Pergunta();
		p41.setAreaAtuacao("Field - Mobilidade");
		p41.setDescricaoPergunta("Ao sincronizar uma conta de e-mail Outolook Exchange em um aparelho Blackberry, o usuário terá acesso a quais recursos no celular?");
		p41.setResposta1("Somente e-mails.");
		p41.setResposta2("E-mails, Calendários e Contatos.");
		p41.setResposta3("E-mails, Calendários, contatos, tarefas e Notas.");
		p41.setResposta4("Apenas a lista de contatos.");
		p41.setRespostaCorreta("E-mails, Calendários, contatos, tarefas e Notas.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p41);
		
		Pergunta p42 = new Pergunta();
		p42.setAreaAtuacao("Field - Mobilidade");
		p42.setDescricaoPergunta("A ferramenta MDM GOOD é utilizada para sincronização de contas Exchange em aparelhos celulares para uso corporativo. Ela contempla quais modelos/sistemas?");
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
		p44.setResposta2("Executar bat de otimização e verificar thin client");
		p44.setResposta3("Verificar serviços em execução, analisar espaço em disco.");
		p44.setResposta4("Todas as alternativas estão corretas.");
		p44.setRespostaCorreta("Todas as alternativas estão corretas.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p44);
		
		Pergunta p45 = new Pergunta();
		p45.setAreaAtuacao("Field - Performance");
		p45.setDescricaoPergunta("Quando for identificado no gerenciador de tarefas um processo com alto consumo de CPU como devemos proceder para solução do problema ?");
		p45.setResposta1("Devemos reiniciar a maquina e caso persista solicitar a troca da maquina.");
		p45.setResposta2("Encaminhar para vdi e solicitar aumento de cpu e/ou memoria.");
		p45.setResposta3("Reparar o processo ou reinstalar a aplicação que está sendo utilizado pelo processo.");
		p45.setResposta4("Devemos desinstalar a aplicação que esta gerando alto consumo de recurso.");
		p45.setRespostaCorreta("Reparar o processo ou reinstalar a aplicação que está sendo utilizado pelo processo.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p45);
		
		Pergunta p46 = new Pergunta();
		p46.setAreaAtuacao("Field - Performance");
		p46.setDescricaoPergunta("Quando uma máquina virtual apresentar problema de performance, acrescentando Cpu e Memória de fato resolvera o problema?");
		p46.setResposta1("Sim, sempre resolve o problema.");
		p46.setResposta2("Não, nunca resolve o problema.");
		p46.setResposta3("Sim, somente se o usuário usa softwares que consomem grande quantidade de recursos computacionais (CPU e memória). Ex: Planilhas excel com macros.");
		p46.setResposta4("Não, o usuário deve solicitar uma maquina fisica para resolver o problema.");
		p46.setRespostaCorreta("Sim, somente se o usuário usa softwares que consomem grande quanbtidade de recursos computacionais (CPU e memória). Ex: Planilhas excel com macros.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p46);
		
		Pergunta p47 = new Pergunta();
		p47.setAreaAtuacao("Field - Performance");
		p47.setDescricaoPergunta("Uma máquina virtual com 4 CPUs é mais rápida que uma máquina com 2 CPUs?");
		p47.setResposta1("Sim, sempre será mais rapida uma MV com 4 CPUs do que uma MV com 2 CPUs");
		p47.setResposta2("Não, o que influência a velocidade é o clock do servidor fisico.");
		p47.setResposta3("Não, a quantidade de CPU não interfere no desempenho da MV.");
		p47.setResposta4("Sim, desde que não haja muitas MVs no host e o mesmo tenha CPU disponivel.");
		p47.setRespostaCorreta("Sim, desde que não haja muitas MVs no host e o mesmo tenha CPU disponivel.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p47);
		*/
		
		Pergunta p48 = new Pergunta();
		p48.setAreaAtuacao("Gravação de Midias e Downloads");
		p48.setDescricaoPergunta("Usuário não possui acesso a determinado site para efetuar download de um arquivos em formato pdf, qual orientação devemos passar para o usuário?");
		p48.setResposta1("Enviar solicitação de acesso ao site para o download ao Security Office.");
		p48.setResposta2("Informar ao usuário que o download não poderá ser efetuado, pois é proibido fazer qualquer tipo de download dentro da rede do banco.");
		p48.setResposta3("Abrir chamado no Helpdesk para verificar as configurações do navegador.");
		p48.setResposta4("Solicitar a aprovação do gestor e encaminhar para o Helpdesk para que possa ser aberto um chamado para a area de gravação de midias.");
		p48.setRespostaCorreta("Solicitar a aprovação do gestor e encaminhar para o Helpdesk para que possa ser aberto um chamado para a area de gravação de midias.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p48);
		
		Pergunta p49 = new Pergunta();
		p49.setAreaAtuacao("Gravação de Midias e Downloads");
		p49.setDescricaoPergunta("Usuário informa que não consegue localizar um arquivo em seu desktop, o mesmo solicita o restore deste arquivo, o que devemos fazer?");
		p49.setResposta1("Enviar pedido de restore para o setor suporte servidores.");
		p49.setResposta2("Enviar pedido de restore para  o setor suporte backup.");
		p49.setResposta3("Enviar pedido de restore para o setor  download de mídias e download.");
		p49.setResposta4("Enviar pedido de restore para o setor  Operação VDI.");
		p49.setRespostaCorreta("Enviar pedido de restore para  o setor suporte backup.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p49);
		
		Pergunta p50 = new Pergunta();
		p50.setAreaAtuacao("Gravação de Midias e Downloads");
		p50.setDescricaoPergunta("Para o pedido de cópia de arquivo ( também pode ser considerado download ) é necessário uma aprovação para o mesmo. Qual ordem de quem o usuário deve solicitar a aprovação?");
		p50.setResposta1("Diretor, coordenador,  gestor.");
		p50.setResposta2("Superintendente, Diretor, gerente.");
		p50.setResposta3("Gestor, gerente, superintendente.");
		p50.setResposta4("Gerente, superintendente, Diretor.");
		p50.setRespostaCorreta("Gerente, superintendente, Diretor.");
		new DAO<Pergunta>(Pergunta.class).adiciona(p50);
		
		
	}

}
