package com.sicoapp.localrestaurants.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.google.android.gms.location.FusedLocationProviderClient
import com.sicoapp.localrestaurants.domain.Repository
import com.sicoapp.localrestaurants.ui.map.DialogEditData
import com.sicoapp.localrestaurants.ui.map.add.AddNewRestaurantDialog
import com.sicoapp.localrestaurants.ui.map.bottom_sheet.BottomSheetDialog
import com.sicoapp.localrestaurants.ui.map.RestaurantDialog
import com.sicoapp.localrestaurants.ui.map.MapFragmentHome
import com.sicoapp.localrestaurants.ui.map.place.LoadDataForCurrentPlace
import com.sicoapp.localrestaurants.ui.map.place.OpenPlaceDialog
import javax.inject.Inject

class MapFragmentFactory @Inject constructor(
    private val dialogWithRestaurantData: RestaurantDialog,
    private val dialogEdit: DialogEditData,
    private val addRestaurantDialog: AddNewRestaurantDialog,
    private val bottomSheetDialog: BottomSheetDialog,
    val repository: Repository,
    private val loadDataForCurrentPlace: LoadDataForCurrentPlace,
    val openPlaceDialog: OpenPlaceDialog,
    private val fusedLocationProviderClient: FusedLocationProviderClient,
    ): FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String): Fragment {
        return when(className) {
            MapFragmentHome::class.java.name -> MapFragmentHome(
                dialogWithRestaurantData,
                dialogEdit,
                addRestaurantDialog,
                bottomSheetDialog,
                repository,
                loadDataForCurrentPlace,
                openPlaceDialog,
                fusedLocationProviderClient
            )
            else -> super.instantiate(classLoader, className)
        }
    }
}