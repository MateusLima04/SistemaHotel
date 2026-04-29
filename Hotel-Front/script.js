let quartos = JSON.parse(localStorage.getItem("quartos")) || [];
let filtroAtual = "todos";

function render() {
  const tabela = document.getElementById("tabelaQuartos");
  tabela.innerHTML = "";

  let quartosAExibir = quartos;

  if (filtroAtual === "disponivel") {
    quartosAExibir = quartos.filter(q => q.disponivel);
  } else if (filtroAtual === "indisponivel") {
    quartosAExibir = quartos.filter(q => !q.disponivel);
  }

  quartosAExibir.forEach(q => {
    const tr = document.createElement("tr");

    // animação de novo
    if (q.novo) {
      tr.classList.add("novo");
      q.novo = false;
    }

    // classe da linha (opcional - só cor de fundo)
    if (!q.disponivel) {
      tr.classList.add("reservado-linha");
    }

    // define classe do status (AGORA CORRETO)
    const statusClass = q.disponivel ? "disponivel" : "reservado";

    tr.innerHTML = `
      <td>${q.numero}</td>
      <td>${q.tipo}</td>
      <td class="${statusClass}">
        ${q.disponivel ? "Disponível" : "Reservado"}
      </td>
    `;

    tr.id = "q" + q.numero;

    tabela.appendChild(tr);
  });

  localStorage.setItem("quartos", JSON.stringify(quartos));

  window.onload = function () {
    render();
  };

}

function cadastrarQuarto() {
  const numero = document.getElementById("numero").value;
  const tipo = document.getElementById("tipo").value;

  if (!numero) return alert("Digite um número!");

  quartos.push({ numero, tipo, disponivel: true, novo: true });
  render();
}

function reservar() {
  const numero = document.getElementById("numeroAcao").value;

  const q = quartos.find(q => q.numero == numero);
  if (q) {
    q.disponivel = false;
    render();
  } else {
    alert("Quarto não encontrado!");
  }
}

function cancelar() {
  const numero = document.getElementById("numeroAcao").value;
  const index = quartos.findIndex(q => q.numero == numero);

  if (index !== -1) {
    const linha = document.getElementById("q" + numero);

    if (linha) {
      linha.classList.add("removendo");
    }

    setTimeout(() => {
      quartos.splice(index, 1);
      render();
    }, 600);
  } else {
    alert("Quarto não encontrado!");
  }
}

function listarDisponiveis() {
  filtroAtual = "disponivel";
  render();
}

function listarIndisponiveis() {
  filtroAtual = "indisponivel";
  render();
}

function listarTodos() {
  filtroAtual = "todos";
  render();
}