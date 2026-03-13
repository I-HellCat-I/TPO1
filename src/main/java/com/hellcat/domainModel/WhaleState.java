package com.hellcat.domainModel;

public enum WhaleState {
    CONFUSED, // Не осознаёт
    AWARE_WHALE, // Осознаёт
    DEAD // Больше не кит
}




/*
                                                                                     @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@ @@
                                                                                    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$BWM#****#MMB@@@BB@@@@@@@@@
                                                                                    @@@@@@@$$M*o#@@@@@W*km00000000000Owa#W#kwZ0000000000wko*ka@@@@@@@@@
                                                                                    @@@@@@Waw00Za@@@@@BkZ00ZZ0000000ZhbmmZZZdpO0000000pdZ0000p$@@@@@@@@@ @  @@aa@@  bwZpdmmw
                                                                                    @@@@@@@MbwkW@@@@@@@@@@@@@@@@@@BB@@@$$M##M#oooa*M*abbdwppwwdhaahh#M#hddbbdbkaW$$M***MMkZkM
                                                                                    @@@@#*M$@@@$#*#*ooahkka*obpdddpbbddkhkhaahhhha#WWM#*o*##B@BM#*ao*$@@Moa**ooMMadpmwdM@#mph
                                                                                    @@@hOOb$@@@*doB$W#*#M$@@W*ao##B@WoW@@@@@@$awwpdo@@*dppZZh$Mbmwbbwd@@dpW@@@@@odhW@#d#@MZmb
                                                                                    @@Bw00w$@@@adM@B##apw#@hZwbaooMBkOb@@$@@@*koMMo*@@@W$@WkaBMkkM@$kh@@wZW@@@@@Mk*@@@WB@Mmmb
                                                                                    @@BZ00mB@@@*dM$**@@BM$@owa@@@@@@b00oMoM@@odaMWB@@@adW@@MM@Wbmwdk#@@@k0mb#@@@Mdh@@@a*@MwZp
                                                                                    @@#000OW@@$abM$kpB@@@@@#dkao$@@@a00Owpk@@WkdppwdM@hp#@@$WB$oda##h*@@bZ*@@@@@$kbB@Wda@BdpaW
                                                                                    @@#0000#@Bkpm#$kd$@@@@@@B@@@@@@@ampw00O#@@@@@@*p*@hm#@@ab#$opa@@hwM@hw#@@@@@BbdW@$*M@WpOZ
                                                                                    @@WO000#@$adm#@bmW@@@@@MaB@@@@@@@##MbOmW@@BB@@@M$@awhWMkkM$#ba@@hm$@aZpkhhh#WhOOpk*@@@bmm
                                                                                    @@$m000o@@##*$@hmaBMaaW#ddh*M*#@B*$@@WM@@Wbwdha#@@@abkdpo@@@#W@@*hW@$#kaookaMobkhkkaoooMB
                                                                                    @@@k000o@@##hW@#bbbbb*@@WabahpkWWao@@BWBB#abbbbka*hdppwpo#ohbdkkddkaahhaMWWWBMMMWMMWW$@@@
                                                                                    @@@a00wW@@MMo*#hbbkoWWW$#hbkbpbkhhhhao*o##*oo**o*###MWWW@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                    @@@*wwk$@B*M*kpdbbaM@@@@@@@@@@@@@@@@@@@@@@WMW$*kaBBB@@@aho$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                    @@@@##B@@Whkm00d*oaho@@@@@@@@@@@@@@@@@@@Mkkhhp000kaa@@#O00b@@@@@@@                                            a #MWWppppwkkh*@@
                                                                                    @@@@@@@@@Wkkp000OdaahW@@@@@@@@@@@@@@@@@@*hhZ0000mhha@@M000d@@@@@@@                 @@ @@@@@@@@$B@@@@@B$*aoh*kbppb*#okddkaabZpW@
                                                                     @       @  @  @@@@##$@@@Wka*d00000dho@@@@@@@@@@@@@@@@@@MakZOOmbaa#@@@Ww0Oh@@@@@@@@@@@@@@@@@@@@@@@@@$BBWMM#*ahkhkdbaM*okha**##W@@B##*oao$@@kmhW
                                           @@  @@@@@@@@@@@@@@@@@@@@@@@@@@WW@WB@B*#B$#ahdmwppdh#WM*ahaoahdmh@@@@@@@@@@@@@@@@@@WB@@@@@@@@@@@@@@$@@@@@@@@@@@@B##oakdpwpddppdbkho#W$@W###**W@@@@#bkoabaBBw0wbdwOk@@ampa
                      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$BM*oaaaaaaokbdpwmwppbhahaoo*W@@@B##WWM#MBB#ahkhaM@@Mwp@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#ahdddddddpkao*MWBBBW#**M$@@@Wabdpb*@@aZOmwwZpB@opkW@@@@@@kdW@@@ao@@*wZp
                     @@@@@$@@W##**#WW*kdpddppbddbkhho##***#M##$@@@$M*ahoB@@Mkdpwwdo@@#wpo#ahoW#dmh*abkM@BmZ$@@@@@@@@@@@@@@@@#bddpppdbbhoMWM###M#W$@W*M@@@@@@@@awmZZZb$@$oao*opmM@omkW@@hdW@Mdd#@@@@@@odo@@@@W$@BpOm
                      hdmdaooo***W@@@B##WM#W@$M#$@@@@@@@MpZOOma$@$hppdpZd#@*Zw*MawpM@owh@@@@@@Mbh@@@B*M@$w0daooo**#M*aaahkkkpbW@@$BMoh*$@@opmmwpk#@omwM@@$@@@@pdW@BM#@@@**@@@aw#@#pdo##W@@@@h0Odo@@@@#pk$@@*k*@$d0Ok
                     Wkwk@@@$WaddhW@WwOppwpoWMdOk@@$@@@@apaBB#*B@@$B@@@hdM@MmwM$M#W@@MZm#@@@@@$bpW@@@WW@@p0d*#M#M$@$M*akbdpdwpM@Wa#W*kdhBWdmo@@@@@@#Z0w*BM$@@@bd*WBBB@@MpdB@@$M@@WdOmpdd*@@@aZdM@@@@@WdpW@@*da@@k0Op
                      wZpB@*a$@Waa#$*mdB@@@@@Wp00kWWB@@@*b#$@$@@@@bp@@@W#B@W00mmma@@@MZ0wkM@@@@bmM@@Bbk@@b0mbo*#W@@@Wadm000mww*@WaW@@@@@@@dZo@@@@@@MZ00wahd#@@kZZZmmZa@WppM@@Bh*$Wkpo@@Mka$@*Ob@@@@@@@bwo@@W#B@@a00Z
                      Wbw#$akB@@@@@@Wmw*@@@@@@k00OddkM@@*wmwwmwh$Wwp$@@$*#@BwZ*B#ao$@BmpB@@@@@@hw*@@#dh@@kOhMW@@@@@Bhddbhaa*hma@owh@@@@@@@MhbkhW@@@@w0wm000d@@@@@@@#pkBBbw*@@Mpb#Bowh@@$bd#@Bmw@@@@B$@aOmdbkM@@@*00Z
                      WkpW@kZ*@@@@@@@M#**M@@@@a00Z000d$@@@@@@#db$@dmW@@#ph@@ZOW@@*wk@Wwd@@@@@@@h0bB$MWB@@aOdho$@@@@MdOw*oa#B*Zk@*Zb@@@@@@@$B@@@@@@@@kZa*w00p@@@@@@@@$W@@*dhB@omdM@Mdk@@@kwa@$pZmpddb*@Mkho*#B@@$#oM$
                      Wkm#@km#@@@@@@@##@@@@@@@Mbh*d00pB@@@@@@@W#@@bmM@@#mp@@dwW@@WZb@$dZbkbbh#WaZ0Omd*@@@omo@@@@@@@Ww0ZaoB@@Wmb@#mpW@@@@@@MaW@@@@@@@B*$@Bh0w@@#bdh#MooB@Wd0Owmmh@@@$B@@@M*#@@MaahaakbbpZwwwwpbkh#@@@
                    @@@amM@omo@@@@@@@ha@@@@@@@@#B@@*pdW@*dbo#W##@@hZmppmmo@@MoW@@$a#@@Babhooh*BMahkkkhaooaM@@@@@@@@Mp00ao$@@@ba@Wpp#@@Ma#@*pb#M#**$@MoW@@@o#@@@*bbhoM@@@@Woaaao**hkdpddpppdka*##M@@@@@@@@@@@@@@@@@@@
                    @@@$#$@oZdo*appB@bmdkkka#@BoM@@@WB@@@okkh*#B@@$#*hbk*WBWohhahhkdpdbddka**#M*oaaoo**#W@@@@@@@@*oMabkohB@@@BM@$kmwdbwZk$$obpdbbk#$W*M@@@M###ohbdpppbkhhhhho#B@@$$B$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                   @@WWB*W@Wkppddda@@BakbkhhaMMha#M*o***ahkbbbbbbbkhkkhaM$W##**##MWBBB$@@@@@@@@@@@@@@@@@@@@@@@@@@@M#MWM#W@@@@WaM@Wakkho#B@@Wobbdddbkbkkoaooo*MMMWWBB$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  @@@@
                   @@*o#*#WMokbk*@@@@Wohbbbkhhbkkhkkhaooao*o**##MWWW$$B$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@BM*hbddk*BWB$#kpdk*W$@@@@@@@@@@@@@@@@@@@@@@@  @@@@@@
                   $*dk$@@M*abba#$BWBWB$$$$@$$@@@@@@@@@@@@@@$BWWWMM#oooakhakbbbddka*#*hkbdbbbkkkhhhaoaoMB@@@@@@@@@@@@@@@@@@@@@@@Mbdwmdo*B@@#p0Oh@@@@@@
                   Mb00*@@@@$WMM#akdb*@@@@$#ooao##**#B@@@MW@@@@@@@@@@@@@@$$$BM##WMMM#*akkkbdpppwmmwwmmwwpbhkbbddka*##*hbdkho**oohwmmwbooW@@h000pW@@@@@a
                  @$b00o@@$ad*$Bobm00pa@@*kO0OOO0OOZpaB$awwb#@@@@@@@@@@@@B*hbdko*#W@@@@@@BWMMMW$@@@@@@@$BB$$BBB$@@@@@B#oaoabbbddppppbo#MM#hpZOOZmwwmwm0wM@
                   WamZ#@@B##B@@@@Mobb*@@aw0ma#M*o*##*$@*Z0ZhW@@@$@@@@@@$hm0OOO00Opo@@@WodmZOOZmwbo@@@#bwwdbbbbha#@@@@@@#WWWWMMWBB@@@@@@$@@@$W$@@@@@#Z00B@
                  @@MwmM@@#dpo@@@@@@@B$@@om0wW@@@@@@@@@$b000wo@@B$@@@@@@aZphMBB#adpo@@@$#oooaahpZOd#@@Md000ZZZ000pa@@@#bmOmbhkdwwb#@$abpwwbbdwdhW@@@Bw00*@
                  @@kmpW@@omZh$@@@@@@@@@@kZOkM@@@@@@@@@$h0000bM$M#$@@@@@aZd#@@@@*o#W@@@$@WM@@@@*dmbW@@MpOd*B@B#bOma@@$k00b#@@@@B#*B@#d00ZddpwZ0ZkW@@MO00h$
                  @*Z0wB@@hOOa@@@@@@@@@@@*kdddddhB@@@@@$b0000whokphW@@@Bhmb*B$$$@@@@@@@odbM@@@@*pmh$@@aO0bB@@@@owwh@@$k0Za@@@@@@@@@@Bkmp*@@@$*pp*@@@MO00k@
                  @#00mW@BbOZo@@@@@@@@@@@@@@W#oa#@@@@@@*w00000pkdwd*@@@#kZ0mwwOOpk*@@@Mp0w#@@@@@#ka@@@#m0poWBWMBWB@@@@a0Zh$@@@@@@@@@Wdwh@@@@@Mbb*@@@*000M@
                 @@oOOb@@$kOZa@@@@@@@@@@$o#@@@@@@@@@@@@Bb0Zdbm0000Za@@@@B*hdddbp0ObM@@BkOm*@@@@WMWB@@@aO000ZZZp#@@@@@$b00ph#WB@@@@@@*wmk$@@@@@@WW@@@a000*
                 @@Mwp*@@BbOw*@@@@@@@@@@Baa#B@@@@@@@@@@Bkmk##hO000Za@@@@@@@@@@@#d0w*@@#pObB@@@@W*o*@@Bk00wkdkaooM@@@@$b000Zwb*@@@@@@#dmdM@@@@@*aB@@@a000p
                 @@@WM$@@BdOmh$@@$*haaB@$kd*$@@@@@@@@@@@Wa*B$*p000Oh@@@@@@@@@@@$kmp*@@*pOp#@@@@omZk$@@omOkB@@B*khB@@@Mb0ma#WB@@@@@@@omma$@@@@amZh@@@h000@
                 @@@@*M@@WbOObhkkakZOa$@MpZh#WWB@@@@@@@@ohB@@@Bh00w*@@$*##o@@@@@Bo#@@@WbZdW@@@WdOw*@@BkZmo@@@@*wOkW@@ow0pM@@@@@@@@@@amZkB@@@$hOm#@@@b00d@
                 @@MddM@@$ap000OO00mbM@@Wkm0OZOOZppb*@@Wa*@@@@@@*ko$@@WbZmh*W@@@$MW@@@amObM@@@#dOmh@@#dOZa@@@@Mw0bW@@#p0dB@@@@@@@@@@opwa@@@@#pmbB@@@d00h
                @@@Wko$@@@@WM##MWM*#B@@@@B*akdbhkdbhM@@#aa#@@@@@##$@@@$op0OOOZbkkoB@@@#p00mpddpZ0k$@@$hZwo@@@@*Z0hB@@om0w*@@@@@@@@@$kOwa$@@@W*aaW@@@w00w
                @@@@@@MkwwwmmmpboB@@$WB$B*aaooo*#M**W$B#MWB@@@@@@@@@@@@@W#*aha*MB@@@@@@#kdppwwmwbM@@@@Mo*B@@@@omZhW@@hp00Zpkhbppb*$BkO0wdkoM$@@@@@@@Z00d
                @@@@@@@@Mokbbbha*$@$#B@@#bpwmmwwmmmmmZmmmmmwwppdpddbbbkkkkkkhhaao*MB$$WMMWM###MMB@@@@@@@B@@@@@W*o*@@@@*bpddppmwpboB$opO0OZmpkM@@@@@@m00w
                          @@  @@@@@@@@@@@@@@@@@@$$BBWMMM#*oooahkkkaakdddpwwmmwwwZZZZZZZmmmwwwwph*ohkbbbbkhhhaaaaao#MWM#**##*#MMM#W$$WM*o*#*o*W@@@@@@w0Zb
                                                 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$$BWWWM#**ooM$W*ahbbdpwwmmmmwpwmmZZmpwwpdhoabbhhkbddbbbbkhhao**MMo*B@
                                                                 @@    @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B$@$MakbdpwwmZZmZOOpoB@@@
                                                                                   @@@@@@*db*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                   @@@@@@d00O*@@@@@#hbbkkko@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                   @@@@@@p000a@@@*h*okbbh*h@@@@@@@@Bho*kdkokdwpbkkh*W@@@@@@@@@@@@@@@@@@
                                                                                   @@@@@@p000a@@*MWbZ00Opoo@@@@@@@@oW*dO00OZmmmwwwdkdwhBB$@@Wbpp#@@@@@@                                                                            # m d  ZZmmdp$$
                                                                                   @@@@@@d000k@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@MaoahaoohdZZmmwwbh*$@$Wkw000000000000k$@
                                                                                   @@@@@@d000k@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$BBBWMM##***oahkha*WB#kdwmmmmZZOOOO0000000ZpwwwZO0ZdhoadwZO0OZZmwwwwwwpbh#WWWM*ooo***#MWBBWh00w#@@
                                                                                   @@@@@@k000b@@@@BWWWMMM#*ooaahkbddk*MBWabwmOOO0000000OmmO000000000000000OOOZZmmwwpdbkkkkbbkhaaaaao*#MWWWMMMBBBWBB$$@@@@@@@@@@@$BBBWWWWB@@@W##*##*o***#@@@@@M000a@
                                                                                   @@@@@@h000d@$hZ00000OZOZZZZmmmwwdbaakkhhhhhhaoo*##MMWWWWB$@@@@@@@@@@@@@@@@$BBBB$@@@@@@@@$#*#*ooo*#B@@@@Mahaaahhaaah*$@@@@$#akkaoohbbbh*@B*kwZZZZZZO0ZkM@@@W000dB@
                                                                                   @@@@@@a000p$MdZpM@@@@@@B$$BBBB@@@@@@@@M*##*oooo**B@$*aaaM@@@@@@@@@@@@@@$#hkkkkbbkoB@@@@*abwmZZZOOwk*@@@#b0000000000waW@@BapO0maWW*ohkh*@$aw00k*ahhhm0do@@@$O00Za
                                                                                   @@@@@@o000pWa00ZW@@@@@BWWW*khba*W@@@#obwmmmZOOOmb*$Wap0mk*@@@@@@@@@@@@@bOOZwwwZ00w#@@@@Mkdhhhhhkm0Zb#@@MkOOdahhhhbZOkM@@WkZOd*@@@@@@@@@@@opZkB@@@@MambM@@@B000m*
                                                                                   @@@@@@o000pWh00OW@@@Mk#@@BhdZ00mhM@@aw0Opkkkkkkha#$$ow00phW@@@BB@@@@@@WZwhaMWModwd*@@@@@@BMW@@@WamZb#@@MkZwhM@@@BapZd#@@BhmmkW@@@@@@@@@@@*dmo$@@@@@Wh#B@@@$Z00Zh@
                                                                                   @@@@@@o000pWoO0OW@@Wob#@@@@@abmwh#@@awOpoW@@@@@@@@@@*w000do$@BB@@@@@@@MZZhB@@@@W*#W@@@@$Mo#@@@@@opmkM@@WhmmhM@@@@##o#B@@@amZk*$@@@@@@@@@@odZkW@@@@@@@WW$@@@w000b
                                                                                   @@@@@@*000wBMd0OM@@$WaoM@@@@@WM##$@@apZb*@@@@@@@@@@@*p0000koB#*o#@@@@@MmOhM@@@@@@@@@@@@opwh$@@@@@*baB@@BaZ0pka***M@@@@@@@*w0OpboB$@@@@@@@od0p*@@@@@@$h*@@@@p000kM
                                                                                   @@@@@@*000wB@*mO#@@Whmwa@@@@@@@@@@@@apZdoMBB$@@@@@@@*p0000OkooawbB@@@Bom0mdkkbbbh*B@@@BkZZbW@@@@@BWBB@@Bam00Ommmwd*@@@@@@#p000wdkoW@@@@@@*d0ma@@@@@MbwhB@@@d000a@
                                                                                  @@@@@@@*000wB$awmM@@MkOwa@@@@@@@@@@@@okpddbbbaM@@@@@@#d00000wbbbOw#@@@@*kmOOZZZOO0Ob#@@$kmZbW@@@@BW$$B@@$am00bhoahkh#B@@@@*dZwko#MW@@@@@@@#d0Zh@@@@$awZhM@@@b00m#@
                                                                                  @@@@@@@*000mW#w0ZM@@WkZmh$@@@@@@@@@@@WMM#*oaaoB@@@@@@Mb00ZmZ000000d#@@@@@W#*##*akw0wo@@@hwZbM@@@@@*dk#@@@aw0d*@@@$*akoB@@@opZdo$@@@@@@@@@@Mb0Oh$@@@@hwZk#@@@h00Ok
                                                                                  @@@@@@@#000mM#m00o@@BhmmkW@@@@@@@@@@@BWB@@@@@@@@@@@@@BhZwkhhd00000d#@@@@@@@@@@@@MbZp*@@@awOdM@@@@MbOpa@@@op0d#@@@@*kmpo@@@opZd*@@@@@@@@@@@Mb0OhB@@@@addoM@@@h000wk
                                                                                  @@@@@@@MO00ZM#w00a@@BammkM@@@@@@@@@@@#ooWB@@@@@@@@@@@@#ddoWMop0000d#@@@@@@@@@@@@@*db*@@@amObM@@@@#b0mh@@@ap0p*@@@@WhZwaB@@*dZpo@@@@@@@@@@@Wk00h#@@@@MWM$$@@@a0000
                                                                                  @@@@@@@MO00Z#Md00*@@$awZkM@@@@@@@@@@@#kdoB@@@@@@@@@@@@@#*#B@M*w000d#@@@#*ooM@@@@@@BB@@@@*w0bW@@@@*d0wo@@@op0wo@@@@WhmmaB@@MbZZb*B@$M*aa*@@#k00baahhoW$@@@@@@o00000
                                                                                  @@@@@@@WO00O#@#ddW@@$awZb*@@@@#ahao@@*bmbM@@@@@@@@@@@@Wko@@@@@BhmZhB@@@odZdao#B@@@*o@@@@*w0ZbhahkbZ0b$@@@Bhmko@@@@$awwaW@@Wkm00OmmZOOZwkM@#kO0000OOZdo@@@@@@#Z000Z
                                                                                  @@@@@@@BZ00OM@@$W$@@@*pOwba###obZpaB@#bOOkaoaaaaaaa#@@B*oW$@@@@@ohM@@@@okZ00Ompbbpb#@@@@$am0000000Zd*@@@@@@##*$@@@@akkoW@@@WabbkkbbbkkhaB@Bohkakaao**W@@@@@@#bka*M
                                                                                   @@@@@@@m00OM@@$a*@@@*dZ00ZmmmZ00wo@@BadZOOZOOOZZph#@@MhbaM@@@@BMB@@@@@@#akbbkha#MB@@@@@@@#oaaaooooM$@@@@@@@@B@@@@@WMMMB@@@@BWMM#####*##M#ooaoaahhbbddddppwpk*@@@
                                                                                   @@@@@@@w00OM@WdZh@@@@#abbbkhhhkhoB@@@@*hooaaooooo*W@@BM##$@@@@@@@@@@@@@$WMM##MMWWWWWWMM#*oahhkkkbba*hdppwpwwOOOO0000000000000000OpkhkwwkhpZZZZZZZOZZmmwwppb*$@@@@
                                                                                   @@@@@@@w00O#@@ab#@@@@@$WMMWB@@@@@@@@$W*ooahkbbbdppdpwwmmZZOO0OOO000O0000000000000000000000000OOOZwoB*kbdpdhhbbbkkhh*MWM###W$@$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                   @@@@@@@d00O#@@@@Baw00000000Opo@@abMMBhZ0000000ZOOOZZmmwpddbddkhhha*WWMWMMWWWWB$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                   @@@@@@@k00O*@@@@@Mabddddddao#WB$W$@@@@@$$$BBBBBB$$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                   @@@@@@@@*bdo@@*aadO0000000000000Z#@@@BobZZZO000OOZwhM*o@@@@d00p@@@@                                                   @@      @@      @@      @      @@      @@@
                                                                                   @@@@@@@@*kk#@@@#o#WMohhhkkkkkbkha#$@@$M#*oahkkkkkhhkk#@@@@@m00O@@@
                                                                                   @@@@@@@Wbmma@@@@@@@@@@W*ooao*#MMMW@@@@@@@@$BBBBBB$$@@@@@@@$m000@@@
                                                                                  @@@@@@@@Ww00d@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@p000@@@                                                            @@      aa bb
                                                                                  @@@@@@@@Bp00wB@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$*a*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$@W@#$BMdM$$BBa$#W#kpbhabpwdh#W#hpwpppwOmM@
                                                                                  @@@@@@@@Ww00mB@@@@@@@$W*oaahh*#*oaaaaahhahhhhhhhhhhh*$@@@@@@@@@@@@@@@@@@BBWW$$$BMMM#####**oaaao*ooahhkkkhkkhhahhha*WWM#oooaao*WBWW#***#$@@dOa@
                                                                                  @@@@@@@@#m00mW@@@@@M*oaddpw0Ob*kdppppmmmmmmmwmmmmZZmpkbpbkkbbbbddkaakkkbkkha**oo*MMWB@@@WM####M@@@@W***oM@@@#hkhkka$@@$abo*ahaWWbZmmwmwo@@b0d$
                                                                                  @@@@@@@@Bd00Z*@@@$#pOZdh#@@*Z0O0000000000000000000000OZh$@@$$BM#W@@@#hahhkh#@Mbh$@@@@@@@owZZO0mM@@odpdpOZo@$k0mkhpwkB@hZb@@@@@@$kdW@@Wko@@b0pW
                                                                                  @@@@@@@@MdO00ZdoW@@$WM*oM@@@h00kooaw00000dooooooookO000d$@#aWMbmmh@Wm0daaa#W$a00hB@$@@@@hkW@$ohW@@$W@@@owo@Bhwa@@#ho$@aZk@@@@@@@kpW@@@BM@@aOpo
                                                                                @@@@@@#kpwwdh*M$@$#hdwmmZ0Oh@@B00d*ak*h000boh#MWWW*kh*bmOpW@*a@@@@MM@WwpB@@@@@@#00ZaW##@@@kb*B@$$@@Bkd#@@Wa#$Bk0ZbhoB@@@#O0doB@@@@bm#@@@oh@@aOmo
                                                                         @ @@@@Wohaooo#WMWWM*hbhMWomOhW@BhwaB@@d0mM@Mhh000dk#@@@@@@Mo*hdwdW$kpW@@@@@@Bdpko#@@@@#000Odpw#@$kwmmmOm*@Mkd#@@$WW@@oOZaokk#@@#mw#$@@@@@km*@@WddB@oZwM
                                                                 @@@@@@@Bobpbbka#W$@@@@BbwdoWBBB$@Bbw#@@@@BMB@@Mm0w@Bak000dk*@@@@@@WoodwOwW@kpM@@@@@@@WW$BB@@@@MZ0pZ000o@@@@@@$awhBMbd#@@WdkW@*Ob@@$hd#@#wb@@@@@@@awo@@$hk$@#m0b
                                                         @@@@@@@@B#hpwwdh*MBWMoabpmdo@@#wmo@@@@@@@@*wbW@@@@akB@@h00WBhk00Odh*@@@@@@#aobwOm#$bm#@@@@@@@ao@@@@@@@@kk#ow00a@@@@@@@@*#$Bhpa@@MdbM@#wk@@$kwo@MwdB@@@@@@amkMWWB@@@Mw0d
                                               @@@@@@@@@@@@$Wobppdh*MMMM@@@#dOZwbbpmp#@$kmbM@@@@@@@$kmb$@@$bZa$@B00dkoaZ0mhW#oaoooahhhpdpdB@hw*@@@MM@@bbB@@@@@@@o#@@$kp*@$hkoWBBMB@@omZbkdmh@@Wba@@$hwo@$kwwmZZpoBowwppb#@@@Wdpa
                                        @ @@@@@@@@@@@Mhdwwda*W@@$#abpmOOdM@$kZd#@@BohM@@Wp0Opk*@@@@@*mm*@@@*wd#@@k00dbbo*o#$@@WohbddO0moM#@@hZwbbpOpM@amZmZZmdW$ao@@@@M@@@Mhddba#@@@@okhaha$@@@@$@@@W*W@@BM**M#*#Mokkkbbkhkka#@@
                                     @@@@@@@@@Wadpppbh#WWW##B@@@#ddkhaadmk@@*wZk@@WM@@@@@oOOboW@@@@@@bZk$@@$*#B@@$p00*$W@@@@@obm000000moakB@@*aahhoM@@@Boo***#BB*#$@@BM#***akkbbbddppwmwwZwhbbdwpwpdddbbbhoo#B@$@@@$$$$$$@@@@@@@
                             @@@@@@@@@@@$*bpwdhoM@@@@$odwZ00mo@@$WMB@@@#wpW@$k00OZZpaW@@@Mwwo@@@@@@@@*ppaM#o*B@@@@*Om*$@@@@@@B#ahhhaa*B@B#*hbdwwkaMM#Maddpwddpdkkhaooo#MWWWWWBB$$@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                     @@@@@@@@@@@@W*kdppkho#W@@@@@@@@@Wbpk**oa*@@@Wkk@@@@MoW@@MZ0b*WW#ahM@$kmbB@@@@@@@WkZOZmwkM@@@@MaM@@@@@@@@$WMMMWMMW$@@@@@@@#aaM@@@@@@@W@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
             @@@@@@@@@@@@@$BBMokbka##MM$BohoB@@@@@@@@BkbM@@@@@@@@#wm#@@@B*a*@@bZkB@@$kmk$@#pZb##apwb#$B*aaaakddpdbaW@@@@@@@@@@@@@@@@@@@@@@@@@@@hpa@@@
          @@@@@@@@@@$M*hkbh*MM#**oaahda@$bOObW@@B@@@@@oph#okdboW@$bZkB@@@hZd$@*pma@@@Mpp#@@#dwpdkkka*M*akddbho#MB@@@@@@@@@@@@@@@@@@@@@@@@@@@@@Ww0d$@@
           @@@B#oakbbkhaoM$@@@Wbmwppba#@@*m00poWMa*@@@MbwwpppwmbB@#ppo@@@#mmM@$aZdB@@@oko@@@$#oahaoaao**#B@@@@@@@@@@@@@@BBB$BWM****oooo*#$@@@@Mm00dB$
            B*mwhM@@BWWodwd*@$aZZo$@@@@@@@h000Obkppo@@@@$$@@@Wbp#@$omdM@@#mO*@@@o*M@@@B*ooohbkkkaW@@@@@@@@@@@@@@BWM#oahkbdpppwwwwwwwmwpkoao$@@Mm00dB$
            MomdB@@BoMB*hpmb#@Mpm*@@@@@@@@#Z000ZO00m#@@@@@@@@@@MB@@BpOmppwZwW@@@@B#oohbppda*W@@@@@@@@@@$M*akdm00000000000000000000000000m*hk$@Mm00Z#W
            @WmOh@@#h#@@@@@@@@@kwbabh#@@@@@kZpkkm000k$@@B*M$@@$WW@@@WhpdkooMBBobpppbk*B@@@@@@@@@@@@@#p0000mwwppdbbbdbp000000wbhhhaaohw000pbb$@Ww000o#
             MowpM@Bhda@@@@@@@@MoMW$$$@@@@@$adoW#bZ0pM@@aZOmmwdhB@@@@$#okdmwa#B@@@@@@@@@@@@$bZOk$Bhad000o#hkkkkhhkkhka#m000*#ho**oooMBk00wkh$@$p00O*#
              Bomh@$hwdW@@@@@@@@WB@@@@@@@@@@@*B@@@@M#$@@$okha*WW*adwmmwh#@@@@@@@@@@@@@@@@@@M000wWWkab00hBM@@@@@@@@@@@kbk00m**@@@@@@@@@Mkpdhh@@@d00mW$
              @#wdW@#pw*@@@@@@@@@aaW@@@@@@@@@aaB@@@@$@@@@W*kpmmwboW@@@@@@@@@@@@   @@@@@@@@@M000wWBkab00k@@@@@@@@@@@@@kdawpoBW@@@@@@@@@@Boo*a@@@b00k@@
              @@dZbB$hmdB@@@@$B@@hwdhohdwwhW@#o*B@@Wokpwwdh#$@@@@@@@@@@@@         @@@@@@@@@@ow0pMBhok00p@@@@@@@@@@@@@kdMo*B@B@@@@@@@@@@abboa$@@k00mB@
              @@oZmM@#pwa@@@#dp*$#bmOZwbha*WW*kwmmdk*W@@@@@@@@@@                  @@@@@@@@@@MkdbM$hok00wW#@@@@@@@@@@@Wkhao*WB@@@@@@@@@Bd0OkkW@@k000MB
               @@MhW@$hmmdbpwZpW@@@$M#oakmZwdh#B@@@@@@@@                          @@@@@@@@@@BhdbM@o*a00Z#kM@@@@@@@@@@@@@@@@@@@@@@@@@@@Bk00bhM@@a000h*
               @@@$#W@$appkoMW$@@B*bpwdaM@@@@@@@                                  @@@@@@@@@@*kdbM$ooa00O*k*@@@@@@@@@@@@@@@@@@@@@@@@@@M#k00baM@@o000db
                @@Mbo@@@M*abdaMM#@@@@@@@                                          @@@@@@@@@@hZ0w#$***w0w*ka@@@@@@@@@@@@@@@@@@@@@@@@@Bk*#oaoh#@@#000mw
                 @@$WodmwphM@@@@@                                                @@@@@@@@@@@#dOm*$#bkhkhkd#@@@@@@@@@@@@@@@@@@@@@@@@@@Mo*oah*@@@M000ZZ
                 @@@@@@@*W@ @                                                     @@@@@@@@@@Whdd*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@B000OO
                 @@@                                                             @@@@@@@@@@@WdOZa@@@@@@@@@@@@@$BWWWWWWWWWWWWWWWMM##***##**o*@@@@k0wha
                                                                                 @@@@@@@@@@@aZ00k$@#ao**#***oooahhhhhkhhhhhhhhhkkbbbbbkkkhaa*@@@*bbaa
                                                                                  @@@@@@@@@@a000bWB**hpwmmZZOO0000000000000000000000000000b*#@@@*oh##
                                                                                  @@@@@@@@@@a000dB@#aZ000000000000000000OOOZZZmwdbkdwZ0000b#W@@@B@@@@ @@@ @@@@@@@@@@$M#*$$*o$$@$$#haW*hoM#okkabdW
                                                                                  @@@@@@@@@@oO00pB@MaZ000wo***o*ooooo*oooo*MB$BB@@@@BWM##MB$$@@@@@@@@@@@@$B$BBMM#MM#akbkhaahkhaMW*a*#MWB#*oha@Wmk
                                                                                  @@@@@@@@@@oO00pB@MaZ00pkk*B@@@@@@@@@@@@@@@@@@@@@@@@$W#ooaakkh*ahbkkoha#BW$@$*hho$@WhkbaWWhppdoBob#@@@Wk#B*k$Bmp
                                                                                 @@@@@@@@@@@oO00pB@#am00pbh@@@@@@@@@@@@@@@@@@@@@@@@@@Mak*$$B*oW@adpbh#opo@$@@$pk#MW@WM@#daBooWMW$op*@@@$kM@@M@$wd
                                                                                @@@@@@@@@@@@MdZmk@@W#d0Odka@@@@@@@@@@@@@@@@@@@@@@@@@@#hdaM#B@@@@abB@@@WwZkao@@dbo#BWkh@@MWBkZpaB@*pkW@@@o*@BhW$db
                                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*akoMh*@@@@Moo#@@BpwO0m$@@$W*h*aa$BhaBakW$o**hM@@@@MhM@B@@dw
                                                                                BWdwpddbbbha*oo*W@@@$BB@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$B#koWha@@@@W#@@@@@MBMmmB@WB@@WB#hoaph$#hW$oa#hdpdb**bbh#@@#o
                                                                                @owbB@@$BBWM*o*#MM*hkbbddddwpppmwZmZmwpwpdddbkkhh*W$W##*MBhd*#o#*kaahoBWW@BM@@okhoM$$#kkaMBM*##ohaahkaooohhao##@@
                                                                                *m0k@@@BMM*hkh#@@@$#ooo*#MW@@$BW$@@@@@@@@@@BWWM###*ooo#M#W*bk*M@B*hdkkhhkhahhhkkkkka*oa*MB@@$$@@@@@@@@@@@@@@@@@@@@
                                                                                WpOh@@#oB$#hwZw#@MbmZZZmZmbW$hpd#@@@@@@@@@@addddba$@@@@$MhdpdaW@$#oa**MWB@@@@@@@@@@@@@@@@@@@@W#oahhkbwmp#@@
                                                                               @Bama@@*oW@@@WahM@omp*$@@@@@@$b00p$@BW@@@@@ampkbwZZo@@$okdmZO0Za$@#dOOOOZOpM@@@Whddoahkh#$Waaooo*#W@@@WwOk@
                                                                               @Wbwo@Mdp*@@@@@@@@ampo@@@@@@@Bd000o@MW@@@@Mbd#@@WaaM@@$WWB@@MpObW@#wmaWMowObW@BdZbM@@W*oW$oZOwpwZ0wa@@Wm0p@
                                                                               @aZw#@#wpM@@@@@@@@#kbkbkM@@@@Wd000doako$@@*pwhB@$@@@@@WhhB@@$kma$@*mm#@@@hpaB@Wpw*@@@@@@@@omk@@@Mkda@@#Z0pb
                                                                               @kOmM@#mpM@@@@@@@@BW@@W#B@@@@Wp0000OZOd#@@MbZOZZmpbW@$hpbB@@@MaW@@aO0bao#W@@@@$wOkW@@@@@@@hZh@@@@MoM@@*O0bh
                                                                               @bOdW@*mpW@@@@@@@@#*$@@@@@@@@BpObbO000wM@@@@BWM*hpmo@BkwbB@@@MMB@$h00Zwpb*@@@@Wm0OwkW@@@@@kZk@@@@$MW@@o00kh
                                                                               @Bo#@@ompW@@@WMW@$ohM@@@@@@@@@okMWkO00pW@@@@@@@@Bkp*@Wkph@@@Bbd#@BhOwo$$MaaB@@#mZh#M$@@@@@kZh@@@Bhk#@@h0Oa*
                                                                               @@BM@@oZOdhakwwhB$hph#WB$@@@@@##@@@#ZOkW@@**$@@@@MaW@Wbpa@@@#ww#@BhZd$@@Bdw*@@ompW@@@@@@@$kmh@@@#wpo@@k0O#$
                                                                               @Mk*@@BhdpwwwwbM@@*dmmmmmph#@Bo*@@@@#hW@@WdZda#WBM#@@Wdmb*W#hwdW@Bkmb@@@Wwm*@$aZpW@@@@@@@Bbmh@@@#db#@@b000
                                                                              @@$WB#M#**MMB$$@@@@$#*oooaaa*WMoaW@@@MB@@@@*kwwpbh*W@@@awZZmZmp*@@@oka@@@#mZ#@$aZmaMWM*#B@MdOd#BBWMW@@@b000
                                                                               @@@@#hddddba#B*oMMkwmmpddppddbkkooaaooo*####WMMW$$@@@@BM##***W@@@@@W#@@@MkhM@@WbwwmZZZpaWMbZOZmwkW@@@@d000
                                                                                        @@    @@@@@@@@@@@@@@$BMBMMoohoohbdpwwppwwwmZZZmmmmmphabdppbbaa*ooa#MWMM#MWBWWW$@BBBWM##MB@@@@bmpw
                                                                                                    @   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@$BWM##**oahhhhkbbaoahhbpmmmmwwwppdbaM@@@
                                                                                                                           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                                                                                @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                                                                                                                                                                  @@ @@@@@@@@@@@@@@@@@@@
























 */