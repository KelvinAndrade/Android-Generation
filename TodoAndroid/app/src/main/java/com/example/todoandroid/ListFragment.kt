package com.example.todoandroid

import android.os.Bundle
import android.service.controls.actions.FloatAction
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.todoandroid.adapter.TarefaAdapter
import com.example.todoandroid.databinding.FragmentListBinding
import com.example.todoandroid.model.Tarefa

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentListBinding.inflate(layoutInflater, container, false)


        val listTarefas = listOf(
            Tarefa(
                "Lavar a louça",
                "Lavar a louça do dia todo",
                "Kelvin",
                "2022-09-28",
                false,
                "Dia a dia"
            ),
            Tarefa(
                "Ir correr",
                "Correr no Max Feffer durante varios minutos",
                "Kelvin",
                "2022-09-30",
                false,
                "Dia a dia"
        ),
            Tarefa(
                "Praticar esportes",
                "Praticar futebol americano",
                "Kelvin",
                "2022-09-30",
                false,
                "Dia a dia"
            )
        )

        //configuração do RecyclerView
        val adapter: TarefaAdapter()
        binding.recyclerTarefa.layoutManager = LinearLayoutManager(context)
        binding.recyclerTarefa.adapter = adapter
        binding.recyclerTarefa.setHasFixedSize(true)

        adapter.setList(listTarefas)



        binding.floatingAdd.setOnClickListener {
            findNavController().navigate(R.id.action_formFragment_to_listFragment)
        }

        return binding.root
    }
}