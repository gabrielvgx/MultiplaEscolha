window.onload = function(){
	document.querySelector('#disciplina').addEventListener('click', function(e){ ExibirOutra(e.target.id) });
	document.querySelector('#salvar_outra').addEventListener('click', function(e){ SalvarOutra(e.target.id) });
	document.querySelector('#estilo-inserir').addEventListener('click', ExibirCamposEspecificos);
	document.querySelector('#inserirAlternativa-inserir').addEventListener('click', Inserir);
	document.querySelector('#excluirAlternativa-inserir').addEventListener('click', ExcluirAlternativas);
	document.querySelector('#limparAlternativa-inserir').addEventListener('click', LimparAlternativas);
	document.querySelector('#estilo-inserir').addEventListener('mouseout', Alternativa);
}

let valor = 4;

function SalvarOutra(){
	
	let option = document.createElement('option'),
	txt_option = document.querySelector('#txt_outra').value;
	
	option.setAttribute('value', valor);
	option.setAttribute('id','disciplina' + valor)
	option.innerHTML = txt_option;

	document.querySelector('#outra').setAttribute('value', valor + 1);
	document.querySelector('#disciplina').appendChild(option);

	valor++;
	
}

function ExibirOutra(){
	if(document.querySelector('#disciplina').value == 1){
		document.querySelector('#outra_disciplina').className = 'mostrar';
	}else{
		document.querySelector('#outra_disciplina').className = 'esconder';
	}
}

function ExibirCamposEspecificos(){
	let txt_questao = document.querySelector('#txt_questao');
	txt_questao.className = 'mostrar';
}

let contadorAlternativas = 0;

function Inserir(){
	if(contadorAlternativas<=4){
		let div = document.createElement('div'),
		div2 = document.createElement('div'),  
		div3 = document.createElement('div'),
		textArea = document.createElement('textArea'),
		p = document.createElement('p');

		
		div.classList.add('row');
		
		div2.classList.add('col');
		div2.classList.add('s3');
		
		div3.classList.add('col');
		div3.classList.add('s6');

		textArea.classList.add('materialize-textarea');
		textArea.setAttribute('id','alt' + contadorAlternativas);
		textArea.setAttribute('name','alternativa' + contadorAlternativas);

		p.innerHTML = "Alternativa: " + (contadorAlternativas + 1);

		div3.appendChild(p);				
		div3.appendChild(textArea);
		div.appendChild(div2);
		div.appendChild(div3);
		
		document.querySelector('#alternativas-inserir').appendChild(div);

		let cBoxDiv = document.createElement('div')
		let cBox = document.createElement('input');
		let cBoxLabel = document.createElement('label');
		
		cBoxDiv.appendChild(cBox);
		cBoxDiv.appendChild(cBoxLabel);
		div.appendChild(cBoxDiv);
		
		cBox.setAttribute('id','cBox' + contadorAlternativas);
		cBox.setAttribute('name','cBox' + contadorAlternativas);
		cBox.setAttribute('type', 'checkbox');
		cBox.setAttribute('class', 'filled-in');
		cBox.classList.add('checkboxes');

		cBoxLabel.innerHTML = "Verdadeiro";
		cBoxLabel.setAttribute('for', 'cBox' + contadorAlternativas);

		let bRadioDiv = document.createElement('div')
		let bRadio = document.createElement('input');
		let bRadioLabel = document.createElement('label');
		
		bRadioDiv.appendChild(bRadio);
		bRadioDiv.appendChild(bRadioLabel);
		div.appendChild(bRadioDiv);
		
		bRadio.setAttribute('id','bRadio' + contadorAlternativas);
		bRadio.setAttribute('name','bRadio');
		bRadio.setAttribute('type', 'radio');
		bRadio.classList.add('botoesRadio');
		
		if(document.querySelector('#estilo-inserir').value==0){
			document.querySelector('#adicionar_excluir-inserir').className = 'mostrar';
			document.querySelector('#alternativas-inserir').className = 'mostrar';
			bRadioDiv.classList.add('botoesRadioIns');
			bRadioDiv.classList.add('mostrar');
			cBoxDiv.classList.add('esconder');
		}
		else if(document.querySelector('#estilo-inserir').value==1){
			document.querySelector('#adicionar_excluir-inserir').className = 'mostrar';
			document.querySelector('#alternativas-inserir').className = 'mostrar';
			cBoxDiv.classList.add('checkboxesIns');
			cBoxDiv.classList.add('mostrar');
			bRadioDiv.classList.add('esconder');

		}

		bRadioLabel.innerHTML = "Correto";
		bRadioLabel.setAttribute('for', 'bRadio' + contadorAlternativas);
		
		div.appendChild(document.createElement('br'));
		div.appendChild(document.createElement('br'));
	}
	
	contadorAlternativas++;
}

function Alternativa(){
	let checkboxes = document.querySelectorAll('.checkboxesIns'),
	botoesRadio = document.querySelectorAll('.botoesRadioIns');
	
	if(document.querySelector('#estilo-inserir').value=="" || document.querySelector('#estilo-inserir').value==2){
		document.querySelector('#adicionar_excluir-inserir').className = 'esconder';
		document.querySelector('#alternativas-inserir').className = 'esconder';
	}
	else if(document.querySelector('#estilo-inserir').value==0){
		document.querySelector('#adicionar_excluir-inserir').className = 'mostrar';
		document.querySelector('#alternativas-inserir').className = 'mostrar';
		document.querySelector('#resposta').className = 'esconder';
		
		for(let bradio of botoesRadio){
			bradio.classList.remove('esconder'),
			bradio.classList.add('mostrar');
		}
	}
	else if(document.querySelector('#estilo-inserir').value==1){
		document.querySelector('#adicionar_excluir-inserir').className = 'mostrar';
		document.querySelector('#alternativas-inserir').className = 'mostrar';
		document.querySelector('#resposta').className = 'esconder';

		for(let cbox of checkboxes){
			cbox.classList.remove('mostrar'),
			cbox.classList.add('esconder');
		}
	}
}

function LimparAlternativas(){
	let div = document.querySelector('#alternativas-inserir');
	while(div.firstChild){
		div.removeChild(div.firstChild);
	}
	contadorAlternativas=0;
}

function ExcluirAlternativas(){
	let div = document.querySelector('#alternativas-inserir');
	if(div.firstChild){
		div.removeChild(div.lastChild);
	}
	contadorAlternativas--;
}
