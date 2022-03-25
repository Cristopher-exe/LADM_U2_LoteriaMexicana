package mx.tecnm.tepic.ladm_u2_loteriamexicana

import android.app.AlertDialog
import android.content.Context

class threadImp(arrayImg : Array<Int>, cont : Int, context : Context, mainA : MainActivity): Thread() {

    var mainA = mainA
    val arrayImg = arrayImg
    var cont = cont
    var contex = context
    var text = ""
    var text2 = ""
    var t = arrayImg.size
    //-----------------------------

    override fun run(){
        super.run()
        while (cont < t){
            when(arrayImg[cont]) {
                1 -> { text += "El Alacran\n" }
                2 -> { text += "El Apache\n" }
                3 -> { text += "El Árbol\n" }
                4 -> { text += "El Arpa\n" }
                5 -> { text += "El Bandolon\n" }
                6 -> { text += "El Barril\n" }
                7 -> { text += "El Borracho\n" }
                8 -> { text += "El Camaron\n" }
                9 -> { text += "El Cantarito\n" }
                10 -> { text += "El Catrin\n" }
                11 -> { text += "El Cazo\n" }
                12 -> { text += "El Corazón\n" }
                13 -> { text += "El Cotorro\n" }
                14 -> { text += "El Diablito\n" }
                15 -> { text += "El Gallo\n" }
                16 -> { text += "El Gorrito\n" }
                17 -> { text += "El Melon\n" }
                18 -> { text += "El Mundo\n" }
                19 -> { text += "El Musico\n" }
                20 -> { text += "El Negrito\n" }
                21 -> { text += "El Nopal\n" }
                22 -> { text += "El Pajaro\n" }
                23 -> { text += "El Paraguas\n" }
                24 -> { text += "El Pescado\n" }
                25 -> { text += "El Pino\n" }
                26 -> { text += "El Sol\n" }
                27 -> { text += "El Soldado\n" }
                28 -> { text += "El Tambor\n" }
                29 -> { text += "El Valiente\n" }
                30 -> { text += "El Venado\n" }
                31 -> { text += "El Violoncello\n" }
                32 -> { text += "La Araña\n" }
                33 -> { text += "La Bandera \n" }
                34 -> { text += "La Bota\n" }
                35 -> { text += "La Botella\n" }
                36 -> { text += "La Calavera\n" }
                37 -> { text += "La Campana\n" }
                38 -> { text += "La Chalupa\n" }
                39 -> { text += "La Corona\n" }
                40 -> { text += "La Dama\n" }
                42 -> { text += "La Escalera\n" }
                42 -> { text += "La Estrella\n" }
                43 -> { text += "La Garza\n" }
                44 -> { text += "La Luna\n" }
                45 -> { text += "La Maceta\n" }
                46 -> { text += "La Mano\n" }
                47 -> { text += "La Muerte\n" }
                48 -> { text += "La Palma\n" }
                49 -> { text += "La Pera\n" }
                50 -> { text += "La Rana\n" }
                51 -> { text += "La Rosa\n" }
                52 -> { text += "La Sandia\n" }
                53 -> { text += "La Sirena\n" }
                54 -> { text += "Las Jaras\n" }
                else -> { text += "${arrayImg[cont]}"+"\n" }
            }//when
            cont++
            sleep(2)
        }//while
        print(text)
        var x = text
        //******IMPLEMENTACION DEL HILO******
        mainA.runOnUiThread{
            AlertDialog.Builder(contex)
                .setTitle("Cartas Restantes")
                .setMessage(x)
                .setNeutralButton("Salir", {d,i->d.dismiss()})
                .show()
        }
        text = text2
    }//run
}//class