# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|

  # Used box
  config.vm.box = "ubuntu/trusty64"

  # Private Network
  config.vm.network :private_network, ip: "192.168.68.77"

  # Install stuff
  config.vm.provision :shell, :path => ".provision/bootstrap.sh"

  # Share Jenkins jobs
  config.vm.synced_folder "jobs/", "/var/lib/jenkins/jobs",
    mount_options: ["dmode=777", "fmode=666"]

  # uncomment the following lines to allocate more memory to the VM
  #config.vm.provider :virtualbox do |vb|
  #  vb.memory = 1024
  #end
end
