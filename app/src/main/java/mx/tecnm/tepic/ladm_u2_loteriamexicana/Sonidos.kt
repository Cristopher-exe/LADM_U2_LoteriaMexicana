package mx.tecnm.tepic.ladm_u2_loteriamexicana

import android.content.Context
import android.media.MediaPlayer

fun Sonidos(arrayImg : Array<Int>,cont : Int, context : Context, mainA : MainActivity) {

    var context = context
    var mediaPlayer_1 : MediaPlayer = MediaPlayer.create(context,R.raw.el_alacran)
    var mediaPlayer_2 : MediaPlayer = MediaPlayer.create(context,R.raw.el_apache)
    var mediaPlayer_3 : MediaPlayer = MediaPlayer.create(context,R.raw.el_arbol)
    var mediaPlayer_4 : MediaPlayer = MediaPlayer.create(context,R.raw.el_arpa)
    var mediaPlayer_5 : MediaPlayer = MediaPlayer.create(context,R.raw.el_bandolon)
    var mediaPlayer_6 : MediaPlayer = MediaPlayer.create(context,R.raw.el_barril)
    var mediaPlayer_7 : MediaPlayer = MediaPlayer.create(context,R.raw.el_borracho)
    var mediaPlayer_8 : MediaPlayer = MediaPlayer.create(context,R.raw.el_camaron)
    var mediaPlayer_9 : MediaPlayer = MediaPlayer.create(context,R.raw.el_cantarito)
    var mediaPlayer_10 : MediaPlayer = MediaPlayer.create(context,R.raw.el_caso)
    var mediaPlayer_11 : MediaPlayer = MediaPlayer.create(context,R.raw.el_catrin)
    var mediaPlayer_12 : MediaPlayer = MediaPlayer.create(context,R.raw.el_corazon)
    var mediaPlayer_13 : MediaPlayer = MediaPlayer.create(context,R.raw.el_cotorro)
    var mediaPlayer_14 : MediaPlayer = MediaPlayer.create(context,R.raw.el_diablito)
    var mediaPlayer_15 : MediaPlayer = MediaPlayer.create(context,R.raw.el_gallo)
    var mediaPlayer_16 : MediaPlayer = MediaPlayer.create(context,R.raw.el_gorrito)
    var mediaPlayer_17 : MediaPlayer = MediaPlayer.create(context,R.raw.el_melon)
    var mediaPlayer_18 : MediaPlayer = MediaPlayer.create(context,R.raw.el_mundo)
    var mediaPlayer_19 : MediaPlayer = MediaPlayer.create(context,R.raw.el_musico)
    var mediaPlayer_20 : MediaPlayer = MediaPlayer.create(context,R.raw.el_negrito)
    var mediaPlayer_21 : MediaPlayer = MediaPlayer.create(context,R.raw.el_nopal)
    var mediaPlayer_22 : MediaPlayer = MediaPlayer.create(context,R.raw.el_pajaro)
    var mediaPlayer_23 : MediaPlayer = MediaPlayer.create(context,R.raw.el_paraguas)
    var mediaPlayer_24 : MediaPlayer = MediaPlayer.create(context,R.raw.el_pescado)
    var mediaPlayer_25 : MediaPlayer = MediaPlayer.create(context,R.raw.el_pino)
    var mediaPlayer_26 : MediaPlayer = MediaPlayer.create(context,R.raw.el_sol)
    var mediaPlayer_27 : MediaPlayer = MediaPlayer.create(context,R.raw.el_soldado)
    var mediaPlayer_28 : MediaPlayer = MediaPlayer.create(context,R.raw.el_tambor)
    var mediaPlayer_29 : MediaPlayer = MediaPlayer.create(context,R.raw.el_valiente)
    var mediaPlayer_30 : MediaPlayer = MediaPlayer.create(context,R.raw.el_venado)
    var mediaPlayer_31 : MediaPlayer = MediaPlayer.create(context,R.raw.el_violoncello)
    var mediaPlayer_32 : MediaPlayer = MediaPlayer.create(context,R.raw.la_bandera)
    var mediaPlayer_33 : MediaPlayer = MediaPlayer.create(context,R.raw.la_arana)
    var mediaPlayer_34 : MediaPlayer = MediaPlayer.create(context,R.raw.la_bota)
    var mediaPlayer_35 : MediaPlayer = MediaPlayer.create(context,R.raw.la_botella)
    var mediaPlayer_36 : MediaPlayer = MediaPlayer.create(context,R.raw.la_calabera)
    var mediaPlayer_37 : MediaPlayer = MediaPlayer.create(context,R.raw.la_campana)
    var mediaPlayer_38 : MediaPlayer = MediaPlayer.create(context,R.raw.la_chalupa)
    var mediaPlayer_39 : MediaPlayer = MediaPlayer.create(context,R.raw.la_corona)
    var mediaPlayer_40 : MediaPlayer = MediaPlayer.create(context,R.raw.la_dama)
    var mediaPlayer_41 : MediaPlayer = MediaPlayer.create(context,R.raw.la_escalera)
    var mediaPlayer_42 : MediaPlayer = MediaPlayer.create(context,R.raw.la_estrella)
    var mediaPlayer_43 : MediaPlayer = MediaPlayer.create(context,R.raw.la_garza)
    var mediaPlayer_44 : MediaPlayer = MediaPlayer.create(context,R.raw.la_luna)
    var mediaPlayer_45 : MediaPlayer = MediaPlayer.create(context,R.raw.la_maceta)
    var mediaPlayer_46 : MediaPlayer = MediaPlayer.create(context,R.raw.la_mano)
    var mediaPlayer_47 : MediaPlayer = MediaPlayer.create(context,R.raw.la_muerte)
    var mediaPlayer_48 : MediaPlayer = MediaPlayer.create(context,R.raw.la_palma)
    var mediaPlayer_49 : MediaPlayer = MediaPlayer.create(context,R.raw.la_pera)
    var mediaPlayer_50 : MediaPlayer = MediaPlayer.create(context,R.raw.la_rana)
    var mediaPlayer_51 : MediaPlayer = MediaPlayer.create(context,R.raw.la_rosa)
    var mediaPlayer_52 : MediaPlayer = MediaPlayer.create(context,R.raw.la_sandia)
    var mediaPlayer_53 : MediaPlayer = MediaPlayer.create(context,R.raw.la_sirena)
    var mediaPlayer_54 : MediaPlayer = MediaPlayer.create(context,R.raw.las_jarras)
    var mainA = mainA
    val arrayImg = arrayImg
    var cont = cont

    when(arrayImg[cont]){
        1 -> { mediaPlayer_1?.start()}
        2 -> { mediaPlayer_2?.start()}
        3 -> { mediaPlayer_3?.start()}
        4 -> { mediaPlayer_4?.start()}
        5 -> { mediaPlayer_5?.start()}
        6 -> { mediaPlayer_6?.start()}
        7 -> { mediaPlayer_7?.start()}
        8 -> { mediaPlayer_8?.start()}
        9 -> { mediaPlayer_9?.start()}
        10 -> { mediaPlayer_10?.start()}
        11 -> { mediaPlayer_11?.start()}
        12 -> { mediaPlayer_12?.start()}
        13 -> { mediaPlayer_13?.start()}
        14 -> { mediaPlayer_14?.start()}
        15 -> { mediaPlayer_15?.start()}
        16 -> { mediaPlayer_16.start()}
        17 -> { mediaPlayer_17?.start()}
        18 -> { mediaPlayer_18?.start()}
        19 -> { mediaPlayer_19?.start()}
        20 -> { mediaPlayer_20?.start()}
        21 -> { mediaPlayer_21?.start()}
        22 -> { mediaPlayer_22?.start()}
        23 -> { mediaPlayer_23?.start()}
        24 -> { mediaPlayer_24?.start()}
        25 -> { mediaPlayer_25?.start()}
        26 -> { mediaPlayer_26?.start()}
        27 -> { mediaPlayer_27?.start()}
        28 -> { mediaPlayer_28?.start()}
        29 -> { mediaPlayer_29?.start()}
        30 -> { mediaPlayer_30?.start()}
        31 -> { mediaPlayer_31?.start()}
        32 -> { mediaPlayer_32?.start()}
        33 -> { mediaPlayer_33?.start()}
        34 -> { mediaPlayer_34?.start()}
        35 -> { mediaPlayer_35?.start()}
        36 -> { mediaPlayer_36?.start()}
        37 -> { mediaPlayer_37?.start()}
        38 -> { mediaPlayer_38?.start()}
        39 -> { mediaPlayer_39?.start()}
        40 -> { mediaPlayer_40?.start()}
        42 -> { mediaPlayer_41?.start()}
        42 -> { mediaPlayer_42?.start()}
        43 -> { mediaPlayer_43?.start()}
        44 -> { mediaPlayer_44?.start()}
        45 -> { mediaPlayer_45?.start()}
        46 -> { mediaPlayer_46?.start()}
        47 -> { mediaPlayer_47?.start()}
        48 -> { mediaPlayer_48?.start()}
        49 -> { mediaPlayer_49?.start()}
        50 -> { mediaPlayer_50?.start()}
        51 -> { mediaPlayer_51?.start()}
        52 -> { mediaPlayer_52?.start()}
        53 -> { mediaPlayer_53?.start()}
        54 -> { mediaPlayer_54?.start()}
        else -> { }
    }
}