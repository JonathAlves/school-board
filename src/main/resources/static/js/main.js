function GerarMatricula(){
    const dataAtual = new Date();
    if(dataAtual.getMonth() <= 6){
        periodo = dataAtual.getFullYear().toString() + '01';
    } else {
        periodo = dataAtual.getFullYear().toString() + '02';
    }
    var aleatorio = Math.floor(Math.random() * 100000);
    document.getElementById('matricula').value = (periodo.toString() + aleatorio);
}