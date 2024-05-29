package com.example.qunltd.ui.home

//class HomeAdapter(private val list: List<HomeModel>, private val onClick: (String) -> Unit) :
//    RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
//
//    inner class HomeViewHolder(private val binding: ItemHomeBinding) :
//        RecyclerView.ViewHolder(binding.root) {
//        @SuppressLint("StringFormatMatches")
//        fun bind(item: HomeModel) {
//            with(binding) {
//                root.setOnClickListener {
//                    onClick.invoke(item.name)
//                }
//                ivSetting.setImageResource(item.icon)
////                tvName.text = item.name
////                tvNotification.text = binding.root.context.getString(
////                    R.string.text_notification,
////                    item.numberNotification
////                )
////                viewDot.visibleIf(item.numberNotification > 0)
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
//        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
//        return HomeViewHolder(binding)
//    }
//
//    override fun getItemCount() = list.count()
//
//    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
//        holder.bind(list[position])
//    }
//}