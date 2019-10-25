package com.kavak.brastlewark.interfaces

import android.text.Editable
import com.kavak.brastlewark.data.entities.Citizen
import com.kavak.brastlewark.data.remote.interfaces.IWebErrorListener

interface IHome {
    interface UseCases {
        /**
         * Method used to fetch the available citizens
         */
        fun getCitizens()

        /**
         * Method used to show details of the citizen
         */
        fun onCitizenSelected(citizen: Citizen)

        /**
         * Method used to search on the data available
         * @param query: value to search
         */
        fun onQueryTyped(query:Editable?)

        /**
         * Method used to toggle the search edit field
         */
        fun onSearchIconClick()
    }

    interface RequestListener : IWebErrorListener {
        fun onFetchResponse(
            payload: List<Citizen>?
        )
    }

}
