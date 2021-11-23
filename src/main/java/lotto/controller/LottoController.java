package lotto.controller;

import lotto.domain.LottoTickets;
import lotto.domain.dto.ResultDto;
import lotto.domain.dto.WinningLottoTicketDto;
import lotto.service.LottoService;

public class LottoController {

    private static class LottoControllerHolder {
        private static final LottoController LOTTO_CONTROLLER = new LottoController();
    }

    private final LottoService lottoService;

    private LottoController() {
        lottoService = LottoService.getInstance();
    }

    public static LottoController getInstance() {
        return LottoControllerHolder.LOTTO_CONTROLLER;
    }

    public LottoTickets autoBuyLottoTickets(int money) {
        return lottoService.autoTickets(money);
    }

    public ResultDto lottoResult(WinningLottoTicketDto winningLottoTicketDto) {
        return lottoService.winningResult(winningLottoTicketDto);
    }

}
