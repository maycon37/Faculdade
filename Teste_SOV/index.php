public function carimbos_prv(){
        /*
        CREATE TABLE sov.carimbo_prv (
            id_historico_analise INT NULL,
            carimbo_viabilidade varchar(100) NULL,
            status_preco varchar(100) NULL,
            faixa_distancia varchar(100) NULL
        )
        ENGINE=InnoDB
        DEFAULT CHARSET=latin1
        COLLATE=latin1_swedish_ci;
        CREATE INDEX carimbo_prv_id_historico_analise_IDX USING BTREE ON sov.carimbo_prv (id_historico_analise);
        */
 
        /*
        echo "<pre>";
        print_r($this->produto);
        echo "</pre>";
        die();
        */
 
        $carimbo="ND";
        $status_preco="ND";
        $faixa_distancia_km="ND";
        $linha_nome_calc="ND";
        $velocidade_calculadora="ND";
 
        $linha=$this->getAnaliseLinha();
        $gpon=$this->getManchaGPON();
        $estacao=$this->getSigla_estacao();
        $distancia=$this->getDistanciaEstacao();
        $perimetro=$this->getPerimetroEstacao();
        $id_historico_analise=$this->getIdAnalise();
        $velocidade=$this->getVelocidade();
       
 
        if ($this->produto=="FTTOFFICE") {
 
            if ( $gpon == "O local pesquisado não está dentro de uma mancha GPON") {
                $carimbo="VIAVEL";
                $status_preco="VIAVEL";
                $faixa_distancia_km="ND";
                }else {
                    $carimbo="INVIAVEL";
                    $status_preco="INVIAVEL";
                    $faixa_distancia_km="ND";
                }              
 
        }else{
 
 
        //if ($this->produto=="IP_CONNECT" | $this->produto == "VPN_MPLS") {
           
        if ($distancia <= "500"){
            $faixa_distancia_km = "ATE 0.5 KM";
        }    
        elseif ($distancia <= "1000"){
            $faixa_distancia_km = "ATE 1.0 KM";
        }
        elseif ($distancia <= "1500"){
            $faixa_distancia_km = "ATE 1.5 KM";
        }
        elseif ($distancia <= "2000"){
            $faixa_distancia_km = "ATE 2.0 KM";
        }
        elseif ($distancia <= "2500"){
            $faixa_distancia_km = "ATE 2.5 KM";
        }
        elseif ($distancia <= "3000"){
            $faixa_distancia_km = "ATE 3.0 KM";
        }
        elseif ($distancia <= "5000"){
            $faixa_distancia_km = "ATE 5.0 KM";
        }
        elseif ($distancia <= "7000"){
            $faixa_distancia_km = "ATE 3.0 KM";
        }
        elseif ($distancia > "7000"){
            $faixa_distancia_km = "ACIMA 7.0 KM";
        }
 
        if ($perimetro !="V.tal") {
            $carimbo="INVIAVEL FORA PERIMETRO";
            $status_preco="INVIAVEL";
            $linha_nome_calc="Inviavel";
        }else{
                    if ($linha == "VERDE"){
                        $status_preco="LPU";
                        $linha_nome_calc="Linha verde";
                        if ( $gpon == "O local pesquisado não está dentro de uma mancha GPON") {
                        $carimbo="VERDE PP ONLY";
                        }else {
                        $carimbo="VERDE GPON";
                        }
                    }
 
                    if ($linha == "AMARELA"){
                        if ( $distancia <= "1000") {
                        $carimbo="AMARELA ATE 1KM";
                        $status_preco="LPU";
                        $linha_nome_calc="Linha amarela - Construção até 1km";
                        }else {
                        $carimbo="AMARELA MAIOR 1KM";
                        $status_preco="CALCULADORA";
                        $linha_nome_calc="Linha amarela - Acima de 1km";
                        }
                    }
 
                    if ($linha == "VERMELHA"){
                        $status_preco="CALCULADORA";
                        $linha_nome_calc="Inviavel";
                        if ( $distancia <= "1000") {
                        $carimbo="VERMELHA ATE 1KM";
                        }else {
                        $carimbo="VERMELHA MAIOR 1KM";
                        }
                    }
 
                    if (is_null($estacao)) {
                        $carimbo="INVIAVEL SOV SEM ESTACAO";
                        $status_preco="INVIAVEL";
                    }
 
                }
        if ($carimbo==null && $status_preco==null && $faixa_distancia_km==null) {
             $carimbo = "SOV NAO PROCESSADO";
             $status_preco= "SOV NAO PROCESSADO";
             $faixa_distancia_km= "SOV NAO PROCESSADO";
           
        }
 
        if ($distancia <= "500"){
            $faixa_distancia_km = "ATE 0.5 KM";
        }    
        elseif ($distancia <= "1000"){
            $faixa_distancia_km = "ATE 1.0 KM";
        }
 
        if ($velocidade <= 4096 ) {
            $velocidade_calculadora = "4";
        }elseif ($velocidade <= 10240) {
            $velocidade_calculadora = "10";
        }elseif ($velocidade <= 20480) {
            $velocidade_calculadora = "20";
        }elseif ($velocidade <= 51200) {
            $velocidade_calculadora = "50";
        }elseif ($velocidade <= 102400) {
            $velocidade_calculadora = "100";
        }elseif ($velocidade <= 204800) {
            $velocidade_calculadora = "200";
        }elseif ($velocidade <= 307200) {
            $velocidade_calculadora = "300";
        }elseif ($velocidade <= 409600) {
            $velocidade_calculadora = "400";
        }elseif ($velocidade <= 512000) {
            $velocidade_calculadora = "500";
        }elseif ($velocidade <= 768000) {
            $velocidade_calculadora = "750";
        }elseif ($velocidade <= 1024000) {
            $velocidade_calculadora = "1000";
        }
       
        }
       
        $carimbo_gravar = new Model_Sov_CarimboPrv();
        $carimbo_gravar->gravar($id_historico_analise,$carimbo, $status_preco, $faixa_distancia_km,$linha_nome_calc,$velocidade_calculadora);    
       
       
    }