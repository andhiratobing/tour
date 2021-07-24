package com.ratobing.tour.util

import com.ratobing.tour.models.TourData

object DataSources{

//    fun setUser(){
//        val data = MutableMap<String, String>
//        data(
//            User(
//                name = "Andhi Ratobing",
//                imageUser = "",
//                email = "ratobing6@gmail.com",
//                socialLinkedIn = "",
//                socialGithub = "https://github.com/andhiratobing"
//        ))
//
//
//    }


    fun setMountains(): ArrayList<TourData>{
        val list = ArrayList<TourData>()
        list.add(
            TourData(
                category = "Mountains",
                name = "Rinjani",
                locationName = "Pulau Lombok, NTB",
                locationImage = "https://bit.ly/3i2m37q",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Bromo",
                locationName = "Malang, Jawa Timur",
                locationImage = "https://bit.ly/36AeTBL",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )

        list.add(
            TourData(
                category = "Mountains",
                name = "Ijen",
                locationName = "Bondowoso, Jawa Timur",
                locationImage = "https://bit.ly/3wFR6ei",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Merapi",
                locationName = "Yogyakarta dan Jawa Tengah",
                locationImage = "https://bit.ly/2VErulp",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Semeru",
                locationName = "Malang-Lumajang, Jawa Timur",
                locationImage = "https://bit.ly/3i2mIWs",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Prau",
                locationName = "Wonosobo, Jawa Tengah",
                locationImage = "https://bit.ly/2U5k2ze",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Merbabu",
                locationName = "Semarang-Magelang-Boyolali, Jawa Tengah",
                locationImage = "https://bit.ly/2VEzEdu",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Papandayan",
                locationName = "Garut, Jawa Barat",
                locationImage = "https://bit.ly/3wH5S4y",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.7,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Kelimutu",
                locationName = "Flores, Nusa Tenggara Timur",
                locationImage = "https://bit.ly/3B0rwEo",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Sumbing",
                locationName = "Magelang-Temanggung-Wonosobo, Jawa Tengah",
                locationImage = "https://bit.ly/3i4KalL",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Sindoro",
                locationName = "Temanggung, Jawa Tengah",
                locationImage = "https://bit.ly/3wD5Rys",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Kerinji",
                locationName = "Jambi-Sumatra Barat",
                locationImage = "https://bit.ly/3ewLGML",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Lawu",
                locationName = "Karanganyar, Jawa Tengah, Ngawi-Magetan, Jawa Timur",
                locationImage = "https://tinyurl.com/h7nfe3tc",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Puncak Jaya",
                locationName = "Mimika, Papua",
                locationImage = "https://bit.ly/2UHzT7c",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        return list
    }

    fun setBeaches(): ArrayList<TourData>{
        val list = ArrayList<TourData>()
        list.add(
            TourData(
                category = "Beach",
                name = "Pandawa",
                locationName = "Pulau Lombok, Nusa Tenggara Barat",
                locationImage = "https://bit.ly/3rehnPR",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Senggigi",
                locationName = "Malang, Jawa Timur",
                locationImage = "https://bit.ly/3yKsO4q",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )

        list.add(
            TourData(
                category = "Beach",
                name = "Seminyak",
                locationName = "Bondowoso, Jawa Timur",
                locationImage = "https://bit.ly/3wArrnd",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Balangan",
                locationName = "Yogyakarta dan Jawa Tengah",
                locationImage = "https://bit.ly/3B0upVK",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Klayar",
                locationName = "Malang-Lumajang, Jawa Timur",
                locationImage = "https://bit.ly/3r8NCzZ",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Kuta",
                locationName = "Wonosobo, Jawa Tengah",
                locationImage = "https://bit.ly/3yUyfxA",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Siung",
                locationName = "Semarang-Magelang-Boyolali, Jawa Tengah",
                locationImage = "https://bit.ly/2ULv901",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Kelingking",
                locationName = "Garut, Jawa Barat",
                locationImage = "https://bit.ly/3yTfr1T",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.7,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Nglambor",
                locationName = "Flores, Nusa Tenggara Timur",
                locationImage = "https://bit.ly/3wArQpJ",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Greenbowl",
                locationName = "Magelang-Temanggung-Wonosobo, Jawa Tengah",
                locationImage = "https://bit.ly/3yTfKtz",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Plengkung",
                locationName = "Temanggung, Jawa Tengah",
                locationImage = "https://bit.ly/3hDb2KC",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Teluk Penyu",
                locationName = "Jambi-Sumatra Barat",
                locationImage = "https://bit.ly/36xMLiP",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        return list
    }

    fun setMuseum(): ArrayList<TourData>{
        val list = ArrayList<TourData>()
        list.add(
            TourData(
                category = "Museum",
                name = "Angkut",
                locationName = "Malang",
                locationImage = "https://bit.ly/3hJI8IL",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Nasional Indonesia",
                locationName = "Jakarta",
                locationImage = "https://bit.ly/3kqKOgf",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Fatahillah",
                locationName = "Jakarta",
                locationImage = "https://bit.ly/3kEvTiP",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Blanco Renaissance",
                locationName = "Ubud",
                locationImage = "https://bit.ly/3wFgHnT",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Ullen Sentalu",
                locationName = "Yogyakarta",
                locationImage = "https://bit.ly/3z49eAf",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Tsunami Aceh",
                locationName = "Banda Aceh",
                locationImage = "https://bit.ly/2UavxFN",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Siwalima",
                locationName = "Ambon",
                locationImage = "https://bit.ly/3rdnuUH",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "House of Sampoerna",
                locationName = "Surabaya",
                locationImage = "https://bit.ly/3knTCDt",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Geologi",
                locationName = "Bandung",
                locationImage = "https://bit.ly/3wKfZ8I",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Rekor Indonesia",
                locationName = "Semarang",
                locationImage = "https://bit.ly/3idaA4S",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Museum",
                name = "Anak Kolong Tangga",
                locationName = "Yogyakarta",
                locationImage = "https://bit.ly/2UTFVRX",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )

        return list
    }

    fun setTemple(): ArrayList<TourData>{
        val list = ArrayList<TourData>()
        list.add(
            TourData(
                category = "Temple",
                name = "Borobudur",
                locationName = "Pulau Lombok, Nusa Tenggara Barat",
                locationImage = "https://bit.ly/36MY1YV",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Prambanan",
                locationName = "Malang, Jawa Timur",
                locationImage = "https://bit.ly/2T7Nvbf",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )

        list.add(
            TourData(
                category = "Temple",
                name = "Sewu",
                locationName = "Bondowoso, Jawa Timur",
                locationImage = "https://bit.ly/3ehczUu",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Penataran",
                locationName = "Malang-Lumajang, Jawa Timur",
                locationImage = "https://bit.ly/2T7ay62",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Besakih",
                locationName = "Wonosobo, Jawa Tengah",
                locationImage = "https://bit.ly/3efHgJJ",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Dieng",
                locationName = "Semarang-Magelang-Boyolali, Jawa Tengah",
                locationImage = "https://bit.ly/3xEQjMb",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Gedong Songo",
                locationName = "Garut, Jawa Barat",
                locationImage = "https://bit.ly/3hyC4Tw",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.7,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Plaosan",
                locationName = "Flores, Nusa Tenggara Timur",
                locationImage = "https://bit.ly/3AXbGKA",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Cetho",
                locationName = "Magelang-Temanggung-Wonosobo, Jawa Tengah",
                locationImage = "https://bit.ly/3i4EDMb",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Tikus",
                locationName = "Temanggung, Jawa Tengah",
                locationImage = "https://bit.ly/3i406Vh",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )

        return list
    }

    fun setTopTrips(): ArrayList<TourData>{
        val list = ArrayList<TourData>()
        list.add(
            TourData(
                category = "Mountains",
                name = "Rinjani",
                locationName = "Pulau Lombok, Nusa Tenggara Barat",
                locationImage = "https://bit.ly/3i2m37q",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Mountains",
                name = "Bromo",
                locationName = "Malang, Jawa Timur",
                locationImage = "https://bit.ly/36AeTBL",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )

        list.add(
            TourData(
                category = "Mountains",
                name = "Ijen",
                locationName = "Bondowoso, Jawa Timur",
                locationImage = "https://bit.ly/3wFR6ei",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.8,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Pandawa",
                locationName = "Pulau Lombok, Nusa Tenggara Barat",
                locationImage = "https://bit.ly/3rehnPR",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Beach",
                name = "Senggigi",
                locationName = "Malang, Jawa Timur",
                locationImage = "https://bit.ly/3yKsO4q",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Borobudur",
                locationName = "Pulau Lombok, Nusa Tenggara Barat",
                locationImage = "https://bit.ly/36MY1YV",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )
        list.add(
            TourData(
                category = "Temple",
                name = "Prambanan",
                locationName = "Malang, Jawa Timur",
                locationImage = "https://bit.ly/2T7Nvbf",
                openTime = "07.00-16.00 WIB",
                ratingLocation = 4.9,
                price = "$120",
                overview = ""
            )
        )


        return list
    }
}