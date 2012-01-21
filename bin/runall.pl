#!/usr/bin/perl

use strict;
use warnings;
use File::Find;

my $dir = "part13";
my @files = <$dir/t13*.e>;

foreach my $file (@files) {
  my $cmd = "java e2c $file > out.c";
  system($cmd);
  system("gcc out.c");
  system("a.exe > $file.me");
}