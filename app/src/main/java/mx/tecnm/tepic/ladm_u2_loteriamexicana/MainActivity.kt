package mx.tecnm.tepic.ladm_u2_loteriamexicana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import kotlinx.coroutines.*
import mx.tecnm.tepic.ladm_u2_loteriamexicana.databinding.ActivityMainBinding
import kotlin.coroutines.EmptyCoroutineContext

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        (0..arrayImg.size-1).forEach{
            print(arrayImg[it])
        }

        var cont = 0
        var reImg = arrayImg.shuffle()
        var por = arrayImg.size-1
        val play = binding.Play
        val barajear = binding.barajear
        val restantes = binding.Rest
        val stop = binding.Stop
        val cartas = binding.cartas
        barajear.isEnabled = false
        restantes.isEnabled = false
        stop.isEnabled = false
        reImg

        val corouScoope = CoroutineScope(Job() + Dispatchers.Main)
        var corouMain = corouScoope.launch(EmptyCoroutineContext, CoroutineStart.LAZY){
            //Inicio de la coroutina
            while (true){
                runOnUiThread {
                    Sonidos(arrayImg,cont,this@MainActivity, MainActivity())
                    binding.cartas.setImageResource(arrayImg[cont++])
                    if(cont == arrayImg.size-1){
                        cont = 0
                        AlertDialog.Builder(this@MainActivity)
                            .setMessage("FIN")
                            .setNeutralButton("Salir",{d,i->d.dismiss()})
                            .show()
                        this.cancel()
                    }
                }//runOnUiThread
                delay(2000L)
            }//While
        }//launch

        play.setOnClickListener {

            corouMain.start()
            play.isEnabled = false
            barajear.isEnabled = false
            restantes.isEnabled = false
            stop.isEnabled = true
        }//play

        stop.setOnClickListener {
            corouMain.cancel()
            stop.isEnabled = false
            play.isEnabled = false
            barajear.isEnabled = true
            restantes.isEnabled = true

            if(corouMain.isActive){
                corouMain.cancel()
                println(cont)
                println(arrayImg.size)
                return@setOnClickListener
            }
        }//stop

        restantes.setOnClickListener {
            if(corouMain.isCancelled){
                threadImp(arrayImg,cont,this@MainActivity, this).start()
            }
        }

        barajear.setOnClickListener {
            stop.isEnabled = true
            play.isEnabled = false
            barajear.isEnabled = false
            restantes.isEnabled = false
            //-------------------------------
            cont = 0
            var ImgArray = arrayImg.shuffle()
            ImgArray
            //--------------------------------
            corouMain = corouScoope.launch(EmptyCoroutineContext, CoroutineStart.LAZY) {
                while (true){
                    runOnUiThread{
                        Sonidos(arrayImg,cont,this@MainActivity, MainActivity())
                        cartas.setImageResource(arrayImg[cont++])
                        if (cont == arrayImg.size-1){
                            cont = 0
                            AlertDialog.Builder(this@MainActivity)
                                .setMessage("FIN")
                                .setNeutralButton("Salir",{d,i->d.dismiss()})
                                .show()
                            this.cancel()
                        }
                    }
                    delay(2000L)
                }
            }
            corouMain.start()
        }

    }//onCreate

    var arrayImg = arrayOf( R.drawable.elalacran,R.drawable.elapache,R.drawable.elarbol,
                            R.drawable.elarpa,R.drawable.elbandolon,R.drawable.elbarril,
                            R.drawable.elborracho,R.drawable.elcamaron,R.drawable.elcantarito,
                            R.drawable.elcatrin,R.drawable.elcazo,R.drawable.elcorazon,R.drawable.elcotorro,
                            R.drawable.eldiablito,R.drawable.elgallo,R.drawable.elgorrito,
                            R.drawable.elmelon,R.drawable.elmundo,R.drawable.elmusico,
                            R.drawable.elnegrito,R.drawable.elnopal,R.drawable.elpajaro,
                            R.drawable.elparaguas,R.drawable.elpescado,R.drawable.elpino,R.drawable.elsol,
                            R.drawable.elsoldado,R.drawable.eltambor,R.drawable.elvaliente,R.drawable.elvenado,
                            R.drawable.elvioloncello,R.drawable.laarana,R.drawable.labandera,R.drawable.labota,R.drawable.labotella,
                            R.drawable.lacalavera,R.drawable.lacampana,R.drawable.lachalupa,R.drawable.lacorona,R.drawable.ladama,
                            R.drawable.laescalera,R.drawable.laestrella,R.drawable.lagarza,R.drawable.laluna,R.drawable.lamaceta,
                            R.drawable.lamano,R.drawable.lamuerte,R.drawable.lapalma,R.drawable.lapera,R.drawable.larana,
                            R.drawable.larosa,R.drawable.lasandia,R.drawable.lasirena,R.drawable.lasjaras)


}