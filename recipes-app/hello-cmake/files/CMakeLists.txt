cmake_minimum_required(VERSION 2.6.3)

project(hello-cmake C)

add_executable(hello-cmake hello.c)

install(TARGETS hello-cmake DESTINATION ${CMAKE_INSTALL_PREFIX}/bin)