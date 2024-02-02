document.addEventListener("DOMContentLoaded", function () {

    //array para armazenar os posts agendados
    let agendamentos = [];

    //dom object
    let inputData;
    let inputLegenda;

    //ação de agendamento
    function agendarPost() {

        //extração
        inputData = document.getElementById("date");
        inputLegenda = document.getElementById("caption");

        //pre tratamento
        let data = inputData.value;
        let legenda = inputLegenda.value;

        //checagem
        if (data && legenda) {

            //constrói objeto
            const agendamento = {

                data: data,
                legenda: legenda,
            };

            //adiciona obj agendamento na array de agendaamentos
            agendamentos.push(agendamento); 

            // Limpar os campos do formulário
            inputData.value = "";
            inputLegenda.value = "";
             
            displayAgendamentos(); 

        } else { 
            alert("Preencha todos os campos. xD") 
        }
        
    }


    //ação de display
    function displayAgendamentos(){

        //puxando dado do DOM;
        agendamentosContainer = document.getElementById("agendamentos");

        agendamentosContainer.innerHTML = "";

        //array de agendamentos
        agendamentos.forEach((agendamento,index) => {

            //construindo um elemento 
            const agendamentosItem = document.createElement("div");
            agendamentosItem.className ="agendamento-item";
            agendamentosItem.innerHTML = `<p><strong>Data:</strong> ${agendamento.data}</p><p><strong>Legenda:</strong> ${agendamento.legenda}</p>`;
            agendamentosContainer.appendChild(agendamentosItem);
        });

    }
    //conecta a função de agendamento de posta ao botão do front
    document.querySelector("button").addEventListener("click", agendarPost);
})