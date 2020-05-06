package org.omg.sysml.jupyter.kernel.magic;

import io.github.spencerpark.jupyter.kernel.display.DisplayData;
import io.github.spencerpark.jupyter.kernel.magic.registry.LineMagic;
import io.github.spencerpark.jupyter.kernel.magic.registry.MagicsArgs;
import org.omg.sysml.jupyter.kernel.ISysML;
import org.omg.sysml.interactive.VizResult;

import java.util.List;
import java.util.Map;

public class Viz {
    private static final MagicsArgs VIZ_ARGS = MagicsArgs.builder().required("element").onlyKnownKeywords().onlyKnownFlags().build();

    @LineMagic
    public static DisplayData viz(List<String> args) {
        Map<String, List<String>> vals = VIZ_ARGS.parse(args);
        VizResult vr = ISysML.getKernelInstance().getInteractive().viz(vals.get("element").get(0));
        DisplayData dd = new DisplayData();
        if (vr.hasException()) {
            dd.putText(vr.formatException());
        } else {
            dd.putSVG(vr.getSVG());
        }
        return dd;
    }
}