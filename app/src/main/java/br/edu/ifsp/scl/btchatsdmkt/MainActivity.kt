package br.edu.ifsp.scl.btchatsdmkt

import android.app.ProgressDialog
import android.bluetooth.BluetoothDevice
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter

class  MainActivity : AppCompatActivity() {
    // Referências para as threads filhas
    private var threadServidor: ThreadServidor? = null
    private var threadCliente: ThreadCliente? = null
    private var threadComunicacao: ThreadComunicacao? = null

    // Lista de Disspositivos
    var listaBtsEncontrados: MutableList<BluetoothDevice>? = null

    // BroadcastReceiver para eventos descoberta e finalização de busca
    private var eventosBtReceiver: EventosBluetoothReceiver? = null

    // Adapter que atualiza a lista de mensagens
    var historicoAdapter: ArrayAdapter<String>? = null

    // Handler da tela principal
    var mHandler: TelaPrincipalHandler? = null

    // Dialog para aguardar conexões e busca
    private var aguardeDialog: ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
