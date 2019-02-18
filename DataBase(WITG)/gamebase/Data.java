/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamebase;

import java.util.HashMap;

/**
 *
 * @author Owen
 */
public class Data {

    HashMap<Integer, GameRecord> GNA = new HashMap<>();
        public void gameEntry() {
        /*
        The following code makes a new instance of the class GameRecord
        *and adds it to a hashmap with the an Integer used as the key.
        *Using this technique with a for statement, each game can be refernced and checked 
        *for equality to the user's input 
             */
        GameRecord ActofFighter = new GameRecord("Act of Fighter", "beu", "pc", 1994);
        GameRecord AlteredBeast = new GameRecord("Altered Beast", "beu", "coin-op", 1988);
        GameRecord AsterixandtheMagic = new GameRecord("Asterix and the Magic Cauldron", "beu", "pc", 1986);
        GameRecord AfterTheWar = new GameRecord("After The War", "beu", "pc", 1989);
        GameRecord BadDudesVsDragonNinja = new GameRecord("Bad Dudes Vs DragonNinja", "beu", "pc", 1988);
        GameRecord BadStreetBrawler = new GameRecord("Bad Street Brawler (Computer)", "beu", "pc", 1987);
        GameRecord BadStreetBrawlerNES = new GameRecord("Bad Street Brawler (NES)", "beu", "nes", 1987);
        GameRecord BatmanBeyondRoTJGBC = new GameRecord("Batman Beyond: Return of the Joker (GBC)", "beu", "gbc", 2000);
        GameRecord BatmanBeyondRoTJPS1 = new GameRecord("Batman Beyond Return of the Joker (PS1)", "beu", "ps1", 2000);
        GameRecord BatmanBeyondRoTJN64 = new GameRecord("Batman Beyond Return of the Joker (N64)", "beu", "n64", 2000);
        GameRecord BatmanForeverSNES = new GameRecord("Batman Forever (SNES)", "beu", "snes", 1995);
        GameRecord BatmanForeverDOS = new GameRecord("Batman Forever (DOS)", "beu", "pc", 1995);
        GameRecord BatmanForeverGB = new GameRecord("Batman Forever (GameBoy)", "beu", "gb", 1995);
        GameRecord BatmanForeverGENESIS = new GameRecord("Batman Forever (Genesis)", "beu", "genesis", 1995);
        GameRecord BatmanForeverGameGear = new GameRecord("Batman Forever (Game Gear)", "beu", "gg", 1995);
        GameRecord BeatsOfRagePC = new GameRecord("Beats Of Rage (PC)", "beu", "pc", 2004);
        GameRecord BeatsOfRagePS2 = new GameRecord("Beats Of Rage (PS2)", "beu", "ps2", 2004);
        GameRecord BeatsOfRageDreamCast = new GameRecord("Beats Of Rage (Dreamcast)", "beu", "dreamcast", 2004);
        GameRecord BeatsOfRageWii = new GameRecord("Beats Of Rage (Wii)", "beu", "wii", 2004);
        GameRecord BeatsOfRageXBOX = new GameRecord("Beats Of Rage (XBOX)", "beu", "xbox", 2004);
        GameRecord BeatsOfRagePSP = new GameRecord("Beats Of Rage (PSP)", "beu", "psp", 2004);
        GameRecord BruceLee = new GameRecord("Bruce Lee", "beu", "pc", 1984);
        GameRecord DragonBallAA = new GameRecord("Dragon Ball: Advanced Adventure", "beu", "gba", 2004);
        GameRecord EightmanArcade = new GameRecord("Eightman (Neo-Geo Arcade)", "beu", "coin-op", 1991);
        GameRecord EightmanNeoGeo = new GameRecord("Eightman (Neo Geo)" , "beu", "neogeo", 1991);
        GameRecord GladiatorArcade = new GameRecord("Gladiator (Arcade)", "beu", "coin-op", 1986);
        GameRecord GladiatorPC = new GameRecord("Gladiator (PC)", "beu", "pc" , 1986);
        GameRecord Hammerfist = new GameRecord("Hammerfist", "beu", "pc",1990);
        GameRecord Kareteka = new GameRecord("Kareteka", "beu", "pc", 1984 );
        GameRecord KaretekaGB = new GameRecord("Kareteka (GB)", "beu", "pc", 1984);
        GameRecord KaretekaNES = new GameRecord("Karteka (NES)" , "beu", "nes", 1984);
        GameRecord KnightForce = new GameRecord("Knight Force", "beu", "pc", 1989);
        GameRecord LastActionHeroGB = new GameRecord("Last Action Hero (GB)","beu","gb",1993);
        GameRecord LastActionHeroGG = new GameRecord("Last Action Hero (Gamegear)", "beu", "gg", 1993);
        GameRecord LastActionHeroSNES = new GameRecord("Last Action Hero (SNES)", "beu", "snes", 1993);
        GameRecord LastActionHeroNES = new GameRecord("Last Action Hero (NES)", "beu", "nes", 1993);
        GameRecord LastActionHeroGenesis = new GameRecord("Last Action Hero (Genesis)", "beu", "genesis", 1993);
        GameRecord LastActionHeroPC = new GameRecord("Last Action Hero (PC)", "beu", "pc", 1993);
        GameRecord LethalWeaponPC = new GameRecord("Lethal Weapon (PC)", "beu", "pc", 1992);
        GameRecord LethalWeaponNES = new GameRecord("Lethal Weapon (NES)", "beu", "nes", 1992);
        GameRecord LethalWeaponSNES = new GameRecord("Lethal Weapon (SNES)", "beu", "snes", 1992);
        GameRecord LethalWeaponGB = new GameRecord("Lethal Weapon (GB)", "beu", "gb", 1992);
        GameRecord MadStalkerFMFPC = new GameRecord("MadStalkerFMFPC (PC)", "beu", "pc", 1994);
        GameRecord MarevelSuperHerosInWaroftheGems = new GameRecord("Marevel Super Heros In War of the Gems", "beu", "snes", 1996);
        GameRecord MichaelJacksonsMoonwalkerCoinOp = new GameRecord("Michael Jackson's Moonwalker (CoinOp)", "beu", "coin-op", 1990);
        GameRecord NinjaMission = new GameRecord("Ninja Mission(CoinOp)", "beu", "coin-op", 1986);
        GameRecord Ninja = new GameRecord("Ninja(PC)", "beu", "pc", 1986);
        GameRecord NinjaWarriorsAgain = new GameRecord("The Ninja Warriors Again(PC)", "beu", "pc", 1987);
        GameRecord NinjaWarriorsAgainCoinOp = new GameRecord("The Ninja Warriors Again(CoinOp)", "beu", "coin-op", 1987);
        GameRecord MMPRSNES = new GameRecord("Might Morphin Power Rangers (SNES)", "beu", "snes", 1994);
        GameRecord MMPRGenesis = new GameRecord("Might Morphin Power Rangers (Genesis)", "beu", "genesis", 1994);
        GameRecord MMPRGB = new GameRecord("Might Morphin Power Rangers (GameBoy)", "beu", "gb", 1994);
        GameRecord MMPRGG = new GameRecord("Might Morphin Power Rangers (GameGear)", "beu", "gg", 1994);
        GameRecord MMPRTMSNES = new GameRecord("Might Morphin Power Rangers: The Movie (SNES)", "beu", "snes", 1995);
        GameRecord MMPRTMGenesis = new GameRecord("Might Morphin Power Rangers: The Movie (Genesis)", "beu", "genesis", 1995);
        GameRecord MMPRTMGB = new GameRecord("Might Morphin Power Rangers: The Movie (GameBoy)", "beu", "gb", 1995);
        GameRecord MMPRTMGG = new GameRecord("Might Morphin Power Rangers: The Movie (GameGear)", "beu", "gg", 1995);
        GameRecord PRTFPS1 = new GameRecord("Power Rangers Time Force (PS1)", "beu", "ps1", 2001);
        GameRecord PRTFGBA = new GameRecord("Power Rangers Time Force (GBA)", "beu", "gba", 2001);
        GameRecord PRTFGBC = new GameRecord("Power Rangers Time Force (GBC)", "beu", "gbc", 2001);
        GameRecord PRNSGBA = new GameRecord("Power Rangers Ninja Storm (GBA)", "beu", "gba", 2003);
        GameRecord PRNSPC = new GameRecord("Power Rangers Ninja Storm (PC)", "beu", "pc", 2003);
        GameRecord RunningBattle = new GameRecord("Running Battle", "beu", "sms", 1992);
        GameRecord Saboteur = new GameRecord("Saboteur", "beu", "pc", 1985);
        GameRecord SPVSTWPS3 = new GameRecord("Scott Pilgrim Vs the World", "beu", "ps3", 2010);
        GameRecord SPVSTWXBOX360 = new GameRecord("Scott Pilgrim Vs the World", "beu", "xbox360", 2010);
        GameRecord ShankPC = new GameRecord("Shank (PC)", "beu", "pc", 2010);
        GameRecord ShankXBOX360 = new GameRecord("Shank (XBOX 360)", "beu", "xbox360", 2010);
        GameRecord ShankPS3 = new GameRecord("Shank (PS3)", "beu", "ps3", 2010);
        GameRecord Shank2PS3 = new GameRecord("Shank 2 (PS3)", "beu", "ps3", 2010);
        GameRecord Shank2PC = new GameRecord("Shank 2 (PC)", "beu", "pc", 2010);
        GameRecord Shank2XBOX360 = new GameRecord("Shank 2 (XBOX 360)", "beu", "xbox360", 2010);
        GameRecord KungFuMasterPC  = new GameRecord("Kung-Fu Master (PC)", "beu", "pc", 1984);
        GameRecord KungFuMasterNES  = new GameRecord("Kung-Fu Master (NES)", "beu", "nes", 1984);
        GameRecord KungFuMasterGB  = new GameRecord("Kung-Fu Master (GB)", "beu", "gb", 1984);
        GameRecord KungFuMasterAtari2600  = new GameRecord("Kung-Fu Master (A2600)", "beu", "a2600", 1984);
        GameRecord KungFuMasterAtari7800  = new GameRecord("Kung-Fu Master (A7800)", "beu", "a7800", 1984);
        GameRecord SpartanX2  = new GameRecord("Spartan X 2", "beu", "nes", 1991);
        GameRecord TeenTitans  = new GameRecord("Teen Titans", "beu", "gba", 1991);
        GameRecord TwoCrudeCoinOP  = new GameRecord("Two Crude (Coin Op)", "beu", "coin-op", 1991);
        GameRecord TwoCrudeDudesGenesis = new GameRecord("Two Crude Dudes (Genesis)", "beu", "coin-op", 1992);
        GameRecord VigilantePC = new GameRecord("Vigilante (PC)", "beu", "pc", 1988);
        GameRecord VigilanteSMS = new GameRecord("Vigilante (SMS)", "beu", "sms", 1988);
        GameRecord XMenMASNES = new GameRecord("X-Men: Mutant Apocalypse (SNES)", "beu", "snes", 1994);
        GameRecord WildWestCOWBoysofMooMesa = new GameRecord("Wild West C.O.W.-Boys of Moo Mesa (Coin-Op)", "beu", "coin-op", 1992);
        GNA.put(0, ActofFighter);
        GNA.put(1, AlteredBeast);
        GNA.put(2, AsterixandtheMagic);
        GNA.put(3, AfterTheWar);
        GNA.put(4, BadDudesVsDragonNinja);
        GNA.put(5, BadStreetBrawler);
        GNA.put(6, BadStreetBrawlerNES);
        GNA.put(7, BatmanBeyondRoTJGBC);
        GNA.put(8, BatmanBeyondRoTJPS1);
        GNA.put(9, BatmanBeyondRoTJN64);
        GNA.put(10, BatmanForeverSNES);
        GNA.put(11, BatmanForeverDOS);
        GNA.put(12, BatmanForeverGB);
        GNA.put(13, BatmanForeverGENESIS);
        GNA.put(14, BatmanForeverGameGear);
        GNA.put(15, BeatsOfRagePC);
        GNA.put(16, BeatsOfRagePS2);
        GNA.put(17, BeatsOfRageDreamCast);
        GNA.put(18, BeatsOfRageWii);
        GNA.put(19, BeatsOfRageXBOX);
        GNA.put(20, BeatsOfRagePSP);
        GNA.put(21, BruceLee);
        GNA.put(22, DragonBallAA);
        GNA.put(23, EightmanArcade);
        GNA.put(24, EightmanNeoGeo);
        GNA.put(25, GladiatorArcade);
        GNA.put(26, GladiatorPC);
        GNA.put(27, Hammerfist);
        GNA.put(28, Kareteka);
        GNA.put(29, KaretekaGB);
        GNA.put(30, KaretekaNES);
        GNA.put(31, KnightForce);
        GNA.put(32, LastActionHeroGB);
        GNA.put(33, LastActionHeroGG);
        GNA.put(34, LastActionHeroSNES);
        GNA.put(35, LastActionHeroNES);
        GNA.put(36, LastActionHeroGenesis);
        GNA.put(37, LastActionHeroPC);
        GNA.put(38, LethalWeaponPC);
        GNA.put(39, LethalWeaponNES);
        GNA.put(40, LethalWeaponSNES);
        GNA.put(41, LethalWeaponGB);
        GNA.put(42, MadStalkerFMFPC);
        GNA.put(43, MarevelSuperHerosInWaroftheGems);
        GNA.put(44, MichaelJacksonsMoonwalkerCoinOp);
        GNA.put(45, NinjaMission);
        GNA.put(46, Ninja);
        GNA.put(47, NinjaWarriorsAgain);
        GNA.put(48, NinjaWarriorsAgainCoinOp);
        GNA.put(49, MMPRSNES);
        GNA.put(50, MMPRGenesis);
        GNA.put(51, MMPRGB);
        GNA.put(52, MMPRGG);
        GNA.put(53, MMPRTMSNES);
        GNA.put(54, MMPRTMGenesis);
        GNA.put(55, MMPRTMGB);
        GNA.put(56, MMPRTMGG);
        GNA.put(57, PRTFPS1);
        GNA.put(58, PRTFGBA);
        GNA.put(59, PRTFGBC);
        GNA.put(60, PRNSGBA);
        GNA.put(61, PRNSPC);
        GNA.put(62, RunningBattle);
        GNA.put(63, Saboteur);
        GNA.put(64, SPVSTWPS3);
        GNA.put(65, SPVSTWXBOX360);
        GNA.put(66, ShankPC);
        GNA.put(67, ShankXBOX360);
        GNA.put(68, ShankPS3);
        GNA.put(69, Shank2PS3);
        GNA.put(70, Shank2PC);
        GNA.put(71, Shank2XBOX360);
        GNA.put(72, KungFuMasterPC);
        GNA.put(73, KungFuMasterNES);
        GNA.put(74, KungFuMasterGB);
        GNA.put(75, KungFuMasterAtari2600);
        GNA.put(76, KungFuMasterAtari7800);
        GNA.put(77, SpartanX2);
        GNA.put(78, TeenTitans);
        GNA.put(79, TwoCrudeCoinOP);
        GNA.put(80, TwoCrudeDudesGenesis);
        GNA.put(81, VigilantePC);
        GNA.put(82, VigilanteSMS);
        GNA.put(83, XMenMASNES);
        GNA.put(84, WildWestCOWBoysofMooMesa);
    }

    public HashMap<Integer, GameRecord> getGNA() {
        return GNA;
    }
}
