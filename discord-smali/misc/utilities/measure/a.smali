.class public final synthetic Lcom/discord/misc/utilities/measure/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/misc/utilities/measure/a;->k:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/misc/utilities/measure/a;->k:Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;

    invoke-static {v0}, Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;->a(Lcom/discord/misc/utilities/measure/ViewMeasuringWrapper;)V

    return-void
.end method
