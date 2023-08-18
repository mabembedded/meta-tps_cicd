#!/bin/bash

build_dir=build-tps_cicd

TEMPLATECONF="$PWD/layers/meta-tps_cicd/conf/templates/default" source layers/openembedded-core/oe-init-build-env $build_dir
