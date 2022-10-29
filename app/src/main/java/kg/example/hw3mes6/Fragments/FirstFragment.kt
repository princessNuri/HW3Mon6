package kg.example.hw3mes6.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import kg.example.hw3mes6.Adapters.HistoryAdapter
import kg.example.hw3mes6.MainViewModel
import kg.example.hw3mes6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var viewModel: MainViewModel



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        this.viewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]

        binding.incrementBtn.setOnClickListener {
            viewModel.onIncrement()
        }
        binding.decrementBtn.setOnClickListener{
            viewModel.onDecrement()
        }
        viewModel.liveData.observe(viewLifecycleOwner){
            binding.counterTv.text = it.toString()
        }


    }




}