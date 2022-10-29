package kg.example.hw3mes6.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import kg.example.hw3mes6.Adapters.HistoryAdapter
import kg.example.hw3mes6.MainViewModel
import kg.example.hw3mes6.databinding.FragmentSecondBinding
import kg.example.hw3mes6.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThirdBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var adapter: HistoryAdapter
    private var list = arrayListOf<String>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        initAdapter()
    }

    private fun initAdapter() {
        viewModel.mhistory.observe(viewLifecycleOwner) {
            list.add(it)
            adapter = HistoryAdapter(list)
            binding.recyclerHistory.adapter = adapter
        }
    }
}
