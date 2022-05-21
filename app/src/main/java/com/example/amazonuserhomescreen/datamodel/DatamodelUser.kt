package com.example.amazonuserhomescreen.datamodel
data class DatamodelUser(
    val results: List<ResultType>

)

data class ResultType(
    val name: NameType,
    val location: LocationType,
)

data class NameType(
    val first: String,
)

data class LocationType(
    val street: StreetType,
    val postcode: String
)

data class StreetType(
    val name: String
)