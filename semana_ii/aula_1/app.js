// Função para calcular a média de notas
function calcularMedia(notas) {
    let soma = 0;
  
    // Loop para somar as notas
    for (let i = 0; i < notas.length; i++) {
      soma += notas[i];
    }
  
    // Calcula a média
    const media = soma / notas.length;
  
    return media;
  }
  
  // Função para exibir o status do aluno
  function exibirStatusAluno(media) {
    if (media >= 7) {
      return "Aprovado";
    } else {
      return "Reprovado";
    }
  }
  
  // Variáveis
  const notasDoAluno = [8, 7, 6, 9, 8];
  const nomeDoAluno = "João";
  
  // Chama a função para calcular a média
  const mediaDoAluno = calcularMedia(notasDoAluno);
  
  // Chama a função para exibir o status do aluno
  const statusDoAluno = exibirStatusAluno(mediaDoAluno);
  
  // Exibe os resultados
  console.log(`Notas do aluno ${nomeDoAluno}: ${notasDoAluno.join(', ')}`);
  console.log(`Média: ${mediaDoAluno}`);
  console.log(`Status: ${statusDoAluno}`);
  