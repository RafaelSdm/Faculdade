//window.alert("rfrofkrofk")

function plot(type = 'scatter'){

    type = type.toString().toLowerCase().trim();


    let trace={};

    if(type=='pie'){
        trace = {
            values:[200,400,150,250],
            labels:['titulo 1', 'titulo 2', 'titulo 3', 'titulo 4'],
            type: type
        };
    }



    else if(type == 'bubble'){
        trace = {
            x: [1,2,3,4],
            y: [1,2,3,4],
            marker: {
                size:[10,20,30,40]
            }
        };
    }

    else{
        trace = {
            x:[1,2,3,4],
            y:[1,2,3,4],
            type: type
        };
    }


    if((type == 'scatter') || (type =='bubble')) trace.mode = 'markers'

    if(type =='lines') trace.type = 'scatter'



    const data = [trace];


    Plotly.newPlot('grafico', data, {}, {showSendToCloud: true})




}