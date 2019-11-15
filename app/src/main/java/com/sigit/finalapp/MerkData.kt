package com.sigit.finalapp

import java.util.ArrayList

object MerkData {
    private val merkNames = arrayOf(
        "Honda",
        "Toyota",
        "Mitsubishi",
        "Nissan",
        "Ford",
        "Suzuki",
        "Chevrolet",
        "Jaguar",
        "BMW",
        "Mercedes"
    )

    private val merkDetails = arrayOf(
        "Merek mobil terpopuler di Indinesia yang pertam adalah Honda, Honda merupakan salah satu perusahan otomotif yang berasal dari Jepang. Perusahaan yang berdiri pada tanggal 24 September 1948 dengan pendirinya adalah Soichiro Honda, perusahaan ini mampu meraih kesuksesan dengan menjadi salah satu produsen sepeda motor tebesar di dunia sejak tahun 1959. Honda Motor Company juga merupakan produsen mobil, truk, sepeda motor dan skuter asal Jepang. Selain itu Honda juga memproduksi generator listrik, mesin kelautan , kendaraan segala medan dan peralatan taman.",
        "Berasal dari negara Jepang Toyota Motor Corporation (TMC) merupakan sebuah pabrik industri otomotif yang telah banyak menciptakan mobil-mobil dengan berbagai macam model dan juga memiliki fungsi serta kegunaan yang berbeda-beda. Perusahan otomotif yang berpusat di Toyota, Aichi ini merupakan sebuah perusahaan penghasil mobil terbesar di dunia. Dalam catatannya Toyota mampu membuat memproduksi mobil 1 unit mobil tiap 50 menit dan mampu menghasilkan sekitar 8 sampai dengan 8,5 juta unit mobil pertahunnya di seluruh dunia",
        "Merupakan sebuah perusahaan otomotif yang berasal dari Jepang, Mitsubishi telah banyak memproduksi banyak kendaraan seperti Truk dan mobil-mobil keluarga. Seperti yang kita ketahui mobil-mobil buatan Mitsubishi sangat terkenal akan ketangguhannya, karena mobil-mobil mitsubishi memiliki tenaga yang cukup besar sehingga banyak orang yang menyukai mobil yang identik dengan logo tiga berlian ini. Selain itu untuk harga mobil mitsubishi juga terbilang cukup terjangakau dan sangat cocok untuk kalangan kelas menengah kebawah.",
        "Deretan selanjutnya mengenai merek mobil terpopuler di Indonesia adalah Nissan. Produsen asal Jepang ini hadir ke Indonesia dengan produk-produknya yang berkualitas tinggi sehingga mampu menjadi sebuah merek mobil yang cukup populer di Negara kita ini. Dahulu Nissan dipasarkan dengan nama produk Datsun, namun hanya sampai tahun 1983 saja. Setelah itu produk ini merubah namanya dengan Nissan Motor Company Ltd yang biasa di singkat Nissan.",
        "Sebuah produsen mobil asal Amerika Serikat yang didirikan oleh Henry Ford di Dearborn, dekat Detroit, Michigan. Perusahaan ini didirikan pada 16 Juni 1903. Perusahaan ini menjual mobil dan kendaraan komersial dengan merek Ford dan mobil mewah dengan merek Lincoln. Ford juga memiliki produsen SUV Brazil, Troller, dan dan produsen mobil kencang FPV. Pada masa lalu Ford juga memproduksi traktor dan komponen otomotif",
        "Suzuki, nama yang satu ini memang sudah tidak asing lagi di telinga masyarakat Indonesia terutama dalam dunia otomotif dalam negri. Sebuah perusahaan dengan nama Suzuki ini memang bergerak di bidang otomotif yang banyak memproduksi berbagai macam kendaraan. Selain memproduki jenis kendaraan roda dua, pabrikan asal Jepang yang satu ini juga merupakan sebuah perusahaan penghasil mobil terbesar di dunia. Selain memproduksi mobil dan sepeda motor Suzuki juga memproduksi Mesin dan ATV yang sudah di pasarkan keseluruh negara di dunia.",
        "Sebuah merek otomotif Amerika Serikat yang merupakan divisi dari General Motors. Didirikan oleh Louis Chevrolet dan pendiri GM William C. Durant pada 8 November 1911. Chevrolet diambil General Motors tahun 1917. Diposisikan oleh Alfred Sloan untuk menjual kendaraan sejenis untuk bersaing langsung melawan Ford Model T buatan Henry Ford. Pada saat ini Chevrolet merupakan merek yang menyumbang penjualan terbesar bagi General Motors.",
        "Jaguar Cars Limited Jaguar 2012 logo.png Jenis Perusahaan privat Industri Otomotif Didirikan 4 September 1922 dengan nama Swallow Sidecar Company) Pendiri William Lyons dan William Walmsley, dan William Francis Tranter Kantor pusat Coventry, Inggris Tokoh kunci Ratan Tata, Chairman Dr Ralf Speth, CEO Mike O'Driscoll, Managing Director Produk Mobil Pemilik British Motor Holdings, 1966-1968, British Leyland Corporation, 1968-197x, Subsidiary, 19xx-198x, Subsidiary, 19xx-198x, Ford Motor Company, 19xx-198x Karyawan 10,000 Induk Jaguar Land Rover Situs web Jaguar.com Jaguar Cars adalah sebuah produsen mobil Britania. Didirikan pada 1922 sebagai Swallow Sidecar Company oleh William Lyons, perusahaan ini dinamakan Jaguar Cars setelah PDII karena konotasi jelek dari inisial SS. Perusahaan ini sejak Maret 2008 dimiliki oleh Tata Motors (sebelumnya dari tahun 1990 hingga 2008 Jaguar dimiliki Ford Motor Company). Jaguar dikenal dengan mobil saloon mewah dan olahraga, segmentasi pasar yang telah dimilikinya sejak 1930-an.",
        "Merek mobil terpopuler selanjutnya ialah Bayerische Motoren Werke atau dalam bahas Inggrisnya Bavarian Motor Works atau lebih di kenal dengan BMW merupakan sebuah perusahaan penghasil mobil terbesar dunia yang berasal dari Jerman. Selain memproduksi kendaranan jenis mobil, BMW juga menciptakan kendaraan roda dua yang tangguh dan handal. Didirikan oleh Franz Josef Popp pada tahun 1916, BMW mampu menjelma menjadi sebuah perusahaan mobil terbesar dunia dan si kenal sebagai salah satu perusahaan mobil mewah dengan perfoma tinggi, BMW juga merupakan salah satu perusahaan pertama yangtelag menggunakan teknologi ABS.",
        "Mercedes-Benz adalah divisi dari Daimler AG. Asal mula Mercedes-Benz berasal dari penemuan Karl Benz atas mobil berbahan bakar bensin pertama di dunia yang dipatenkan bulan Januari 1886, Benz Patent Motorwagen. serta jasa dari Gottlieb Daimler serta teknisi Wilhelm Maybach. Mobil-mobil Mercedes pertama kali dijual pada tahun 1901 oleh Daimler Motoren Gesellschaft. Mobil pertama yang memakai merek Mercedes-Benz diproduksi tahun 1926 setelah adanya merger antara perusahaan Benz dengan Daimler menjadi perusahaan Daimler-Benz."
    )

    private val merkesImages = intArrayOf(
        R.drawable.honda,
        R.drawable.toyota,
        R.drawable.mitsubishi,
        R.drawable.nissan,
        R.drawable.ford,
        R.drawable.suzuki,
        R.drawable.chevrolet,
        R.drawable.jaguar,
        R.drawable.bmw,
        R.drawable.mercedesbenz
    )

    val listData: ArrayList<Merk>
        get() {
            val list = arrayListOf<Merk>()
            for (position in merkNames.indices) {
                val merk = Merk()
                merk.name = merkNames[position]
                merk.detail = merkDetails[position]
                merk.photo = merkesImages[position]
                list.add(merk)
            }
            return list
        }
}