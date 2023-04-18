.class public final synthetic Lcf/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcf/w;


# direct methods
.method public synthetic constructor <init>(Lcf/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcf/v;->k:Lcf/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcf/v;->k:Lcf/w;

    invoke-static {v0}, Lcf/w;->K0(Lcf/w;)V

    return-void
.end method
